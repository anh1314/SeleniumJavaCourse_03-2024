package Bai11_Assertions;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

// Assert cứng: nếu Fail ở assert thì CT sẽ dừng ngay tại đó, bỏ qua các lệnh phía sau
public class demoHardAssert extends BaseTest {

    @Test
    public void testLoginCRM(){
        driver.get("https://crm.anhtester.com/admin/authentication");

        // Assert header với text của nó
        String header = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        System.out.println(header);
        Assert.assertEquals(header, "Login");   //so sánh bằng

        // add message nếu xảy ra lỗi
//        String header2 = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
//        System.out.println(header2);
//        Assert.assertEquals(header2, "login", "Fail: giá trị header2 sai");

        //check button Login có enable ko
        boolean checkLoginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']")).isEnabled();
        Assert.assertTrue(checkLoginButton);
//        Assert.assertFalse(checkLoginButton, "button Login không được bật");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // so sánh chứa qua Java
        String menuName = driver.findElement(By.xpath("//span[normalize-space()='Customers']")).getText();
        Assert.assertTrue(menuName.contains("Customer"));   //so sánh menu Customers có chứa text Customer ko
//        Assert.assertTrue(menuName.contains("Customer123"), "menuName ko chứa giá trị mong muốn" +menuName);
    }

}
