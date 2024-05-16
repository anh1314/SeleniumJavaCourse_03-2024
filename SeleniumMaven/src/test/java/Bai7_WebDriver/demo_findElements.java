package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class demo_findElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='password']")).submit();

        // findElements: trả về list giá trị của element
        // lấy list menu với hàm findElements
        List<WebElement> listMenu =  driver.findElements(By.xpath("//ul[@id='side-menu']//li"));
        for (int i =0; i < listMenu.size(); i ++){
            System.out.println(listMenu.get(i));  // lấy list web element
            System.out.println(listMenu.get(i).getText());  // lấy các giá trị Text của từng Element
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
