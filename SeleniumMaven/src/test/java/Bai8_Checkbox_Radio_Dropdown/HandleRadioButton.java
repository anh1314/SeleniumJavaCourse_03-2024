package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createBrownser();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        // trong nhóm radio button, chỉ được chọn 1 radio button trong option đó
        // check radio đã được chọn chưa
        boolean checkRadioMale = driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).isSelected();
        System.out.println("radioMale: " +checkRadioMale);
        boolean checkRadioFemale = driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@name='optradio']")).isSelected();
        System.out.println("radio Female: " +checkRadioFemale);

        // lick chọn radio
        driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).click();
        boolean checkRadioMale2 = driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).isSelected();
        System.out.println("radioMale sau khi click: " +checkRadioMale2);
        //driver.findElement(By.xpath("")).click();
        // xử lý nhiều radio button
        List<WebElement> listRadio = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label/input"));
        System.out.println("tổng số radio button: " +listRadio.size());
        for (int i = 0; i < listRadio.size(); i++){
            System.out.println("radio thứ " +(i+1) +": " +listRadio.get(i).isSelected() );
        }

        // lick chọn radio thứ 2 (index = 1 trong list)
        listRadio.get(1).click();
        List<WebElement> listRadio2 = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label/input"));
        System.out.println("tổng số radio button sau khi click: " +listRadio2.size());
        for (int i = 0; i < listRadio2.size(); i++){
            System.out.println("sau khi click, radio thứ " +(i+1) +": " +listRadio2.get(i).isSelected());
        }




        closeBrownser();
    }

}
