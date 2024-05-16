package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demo_isDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://anhtester.com/");
        // isDisplayed(), isEnabled(), isSelected() trả về giá trị boolean (True/False)

        // isDisplayed(): check phần tử tồn tại trên web có được hiển thị hay không
        boolean CheckElement = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed();
        System.out.println(" Check header isDisplayed: " +CheckElement);
        boolean checkLoginButton =  driver.findElement(By.xpath("//a[@id='btn-login']")).isDisplayed();
        System.out.println("isDisplayed: " +checkLoginButton);



        driver.findElement(By.xpath("")).isSelected();
        System.out.println("");

        Thread.sleep(2000);
        driver.quit();
    }
}
