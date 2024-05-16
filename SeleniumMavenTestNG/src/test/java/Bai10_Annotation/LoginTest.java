package Bai10_Annotation;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void testLoginSuccess(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
    @Test(priority = 2)
    public void testAddCustomer(){
        testLoginSuccess(); // gọi lại testcase  testLoginSuccess
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }

}
