package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createBrownser();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        // kiểm tra checkbox đã chọn hay chưa
       boolean check1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println("kiểm tra checkbox trước khi click: " +check1);
        // click chọn checkbox
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        // kiểm tra checkbox đã chọn hay chưa
        boolean check2 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        System.out.println("kiểm tra checkbox sau click: " +check2);

        // check message đã xuất hiện chưa
        boolean checkMessage = driver.findElement(By.xpath("//div[@id='txtAge']")).isDisplayed();
        System.out.println("xem message xuất hiện: " +checkMessage);
        System.out.println( driver.findElement(By.xpath("//div[@id='txtAge']")).getText());

        // xử lý nhiều checkbox: cách 1
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        for (int i=0; i < listCheckbox.size(); i++ ){
            System.out.println("checkbox vi tri thu " +(i+1) +": " +listCheckbox.get(i).isSelected());
        }

        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Option 2']")).click();
        List<WebElement> listCheckbox2 = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        for (int i=0; i < listCheckbox2.size(); i++ ){
            System.out.println("checkbox sau khi click option 1 va 2,  vi tri thu " +(i+1) +": " +listCheckbox2.get(i).isSelected());
        }

        //cách 2  xử lý nhiều checkbox: dùng trực tiếp index với đoạn xpath cụ thể
        for (int i = 0; i < listCheckbox.size() ; i++){
            System.out.println("Vị trí thứ " +(i+1)+ ": " + driver.findElement(By.xpath("(//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox'])["+(i+1)+"]")).isSelected());

        }

        closeBrownser();
    }
}
