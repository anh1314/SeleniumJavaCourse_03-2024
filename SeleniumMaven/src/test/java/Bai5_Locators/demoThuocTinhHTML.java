package Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demoThuocTinhHTML {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;  // khai báo điều khiển trình duyệt
        driver = new ChromeDriver();    // điều khiển trình duyệt Chrome
        driver.manage().window().maximize();    // mở trình duyệt full screen
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));    //set time tìm kiếm elements

        driver.get("https://crm.anhtester.com/admin/authentication");  // vào URL (website chạy auto)
        Thread.sleep(2000);    // set time chạy chậm auto

        // khai báo và truyền giá trị cho các elements
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(1000);
        //driver.findElement(By.linkText("Forgot Password?")).click();  // full link text
        //driver.findElement(By.partialLinkText("Forgot")).click();       // một phần của link text

        driver.findElement(By.id("remember")).click();  // tick botton Remember me
        Thread.sleep(1000);

        //driver.findElement(By.tagName("botton")).click();     // tag name
        driver.findElement(By.className("btn")).click();  // class name     //botton Login

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();  // Xpath tuyệt đối
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/a[1]")).click();

        Thread.sleep(2000);
        driver.quit();  // tắt trình duyệt
    }
}
