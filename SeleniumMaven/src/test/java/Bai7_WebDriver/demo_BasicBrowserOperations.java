package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class demo_BasicBrowserOperations {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://anhtester.com");

        //điều hướng đến URL
        driver.navigate().to("http://anhtester.com");
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();

        // điều huớng về trang trước
        driver.navigate().back();

        // làm mới trang hiện tại
        driver.navigate().refresh();

        //điều huớng đến trang sau
        driver.navigate().forward();

        // lấy thẻ Title của trang
        String title = driver.getTitle();
        System.out.println("getTitle: " +title);

        // lấy current URL
        String url = driver.getCurrentUrl();
        System.out.println("getURL: "+url);

        // lấy  HTML source của trang
        String html = driver.getPageSource();
        System.out.println("getPageSource: " +html);

        // check "Kiến thức Tester" có nằm trong web không? Trả về True/False
        System.out.println(html.contains("Kiến thức Tester"));

        Thread.sleep(2000);
        driver.quit();
    }
}
