package Bai10_Annotation;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CustomerTest extends BaseTest {

    @Test(priority = 1)
    public void testAddCustomer(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    @Test(priority = 2)
    public void testFilterCustomer(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    @Test(priority = 3)
    public void testAddCustomerDuplicated(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    @Test(priority = 4)
    public void testEditCustomer(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
    @Test(priority = 5)
    public void testDeleteCustomer(){
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
    }
}
