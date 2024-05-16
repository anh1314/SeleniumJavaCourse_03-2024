package Bai6_WebElement;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demo_isSelected {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        // isSelected(): check phần tử có được chọn hay không
        // chỉ áp dụng với Checkbox và Radio button

        boolean check = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
        System.out.println("check Checkbox Default isSelected: " +check);

        driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).click();
        boolean check2 = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected();
        System.out.println("checkbox Default after,  isSelected : " +check2);

        driver.quit();
    }
}
