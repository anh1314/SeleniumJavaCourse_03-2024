package Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demo_XpathTuongDoi {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
        driver.get("https://crm.anhtester.com/admin/authentication");

        // thuộc tính @
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");

        // thuộc tính chuỗi text() hoặc normalize-space()
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("(//a[@href='https://crm.anhtester.com/admin/clients/client'])[2]")).click();    // thuộc tính @ // New Customer

        // hàm chứa: contains
        driver.findElement(By.xpath("//a[contains(normalize-space(),'Billing & ')]")).click(); //Billing & Shipping

        // phương thức bắt đầu: starts-with
        driver.findElement((By.xpath("//a[starts-with(normalize-space(),'Customer ')]")) ).click(); //Customer Details
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

        // toán tử or, and
        driver.findElement(By.xpath("//a[normalize-space()='New Customer' and @href='https://crm.anhtester.com/admin/clients/client']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Customer' or @href='https://crm.anhtester.com/admin/clients/client']"));

        // tổ tiên Ancestor: lấy thẻ bao bọc trực tiếp
        driver.findElement(By.xpath("//span[normalize-space()='Customers Summary']/ancestor::div"));

        // con cháu Descendant: lấy tất cả thẻ con trong thẻ cha
        driver.findElement(By.xpath("//aside[@id='menu']/descendant::div")); // list phần tử con trong thẻ aside
        driver.findElement(By.xpath(" //aside[@id='menu']/ul")); // lấy thẻ ul liền kề thẻ aside
        driver.findElement(By.xpath(" //aside[@id='menu']//ul"));  //lấy từ thẻ aside đến thẻ ul

        //  preceding: lấy tất cả thẻ nằm bên trên nó (trừ thẻ bao bọc nó)
        driver.findElement(By.xpath("(//div[@class='clearfix'])[2]/preceding::div"));
        driver.findElement(By.xpath("(//span[normalize-space()= 'In Progress']/preceding::span[1]"));  //Project Summary > In Progress (lấy số)

        //  following: lấy tất cả thẻ nằm bên dưới nó (ko tính thẻ bên trong nó)
        driver.findElement(By.xpath("(//div[@class='clearfix'])[2]/following::div"));

        // following-sibling: lấy tất cả các thẻ ngang cấp nằm dưới nó
        driver.findElement(By.xpath("//span[normalize-space()= 'In Progress']/preceding-sibling::span")); //Project Summary > In Progress (lấy số)
        driver.findElement(By.xpath("//label[normalize-space()='Currency']/following-sibling::div/button")); //  New Customer > Customer Details > list Currency

        //preceding-sibling: ấy tất cả các thẻ ngang cấp nằm trên nó
        driver.findElement(By.xpath("//label[@for='company']/following-sibling::input")); // New Customer > Company

        // parent: 1 thẻ con chỉ có 1 thẻ cha
        driver.findElement(By.xpath("//div[@id='contact_info']//div[@class='col-md-12']/parent::div"));

        // child: 1 thẻ cha có nhiều thẻ con
        driver.findElement(By.xpath("//div[@id='contact_info']//div[@class='col-md-12']/child::div"));

        Thread.sleep(2000);
        driver.quit();
    }

}
