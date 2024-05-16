package Bai11_Assertions;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// Assert mềm: nếu Fail ở assert thì CT vẫn tiếp tục chạy
//Câu lệnh object.assertAll() được yêu cầu để xem các ngoại lệ
public class demoSortAssert extends BaseTest {

    @Test
    public void testLoginCRM(){
        driver.get("https://crm.anhtester.com/admin/authentication");


        // khai báo đối tượng SortAssert
        SoftAssert softAssert = new SoftAssert();

        // Assert header với text của nó
        String header = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        System.out.println(header);
        softAssert.assertEquals(header, "Login");   //so sánh bằng

        // add message nếu xảy ra lỗi
        String header2 = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        System.out.println(header2);
        softAssert.assertEquals(header2, "login", "Fail: giá trị header2 sai");

        //check button Login có enable ko
        boolean checkLoginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']")).isEnabled();
        softAssert.assertTrue(checkLoginButton);
        softAssert.assertFalse(checkLoginButton, "button Login không được bật");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // so sánh chứa qua Java
        String menuName = driver.findElement(By.xpath("//span[normalize-space()='Customers']")).getText();
        softAssert.assertTrue(menuName.contains("Customer"));   //so sánh menu Customers có chứa text Customer ko
        softAssert.assertTrue(menuName.contains("Customer123"), "menuName ko chứa giá trị mong muốn" +menuName);

        softAssert.assertAll(); // tổng kết lại tất cả các trường hợp sai
    }

}
