package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demo_6MethodsGet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        // getText(): lấy chuỗi Text hiển thị, không tham số và trả về giá trị String
        String headerLogin = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        System.out.println(headerLogin);

        // getTagName(): lấy tên thẻ HTML
        String tagNameHTML = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getTagName();
        System.out.println(tagNameHTML);

        //getCSSValue(): lấy giá trị CSS trong thẻ HTML
        String backgroundColor = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("background-color");
        String fontSize = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("font-size");
        System.out.println("backgroundColor " +backgroundColor);
        System.out.println("fontsize " +fontSize);

        //getSize(): lấy chiều rộng và chiều cao của elements
        Dimension dimension = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getSize();
        System.out.println("chiều cao " +dimension.getHeight());
        System.out.println("chiều rộng " +dimension.width);

        // getLocation(): xác định vị trí của elements, trả về Point(X,Y)
        Point point = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getLocation();
        System.out.println("X " +point.x);
        System.out.println("Y " +point.getY());

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='password']")).submit();
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("CMC Global");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();

        // getAttribute(): lấy giá trị của thuộc tính thẻ HTML, chấp nhận chuỗi làm tham số và trả về chuỗi
        //  thẻ input tên thuộc tính mặc định là "value"
        String companyName = driver.findElement(By.xpath("//input[@id='company']")).getAttribute("value");
        System.out.println("companyName " +companyName);

        Thread.sleep(2000);
        driver.quit();
    }
}
