package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demoRiseCRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rise.fairsketch.com/signin");

        //// xoá giá trị mặc định
        driver.findElement(By.xpath("//input[@id='email']")).clear();

        // truyền giá trị mới
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("client@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");

        // click button
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        //driver.findElement(By.xpath(""));

        Thread.sleep(2000);
        driver.quit();

    }

}
