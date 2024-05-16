package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demo_isEnabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

        // isEnabled(): check phần tử đã được hiển thị, có được Bật( kích hoạt) hay không

        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        boolean checkSubmit = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Submit button isEnabled: " +checkSubmit);

        boolean checkHackedSubmitButton = driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled();
        System.out.println("Hacked Submit button isEnabled: " +checkHackedSubmitButton);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("example@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        boolean checkSubmit2 = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("check Submit button: " +checkSubmit2);

        Thread.sleep(2000);
        driver.quit();
    }
}
