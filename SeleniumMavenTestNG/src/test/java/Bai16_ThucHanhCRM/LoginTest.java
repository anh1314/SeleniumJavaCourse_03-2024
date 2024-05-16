package Bai16_ThucHanhCRM;

import Common.BaseTest;
import ThucHanh_B33.LocatorCRM;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void TestLoginSuccess(){
        driver.get(InfoCRM.URL);
        waitForPageLoaded();
        setText(LocatorCRM.inputEmail, InfoCRM.Email);
        setText(LocatorCRM.inputPassword, InfoCRM.Password);
        clickElement(LocatorCRM.buttonLogin);
        waitForPageLoaded();
        //sau khi login thành công
        boolean checkURL = driver.getCurrentUrl().contains("authentication");   // check URL hiện tại có chứa text "authentication" không
        Assert.assertFalse(checkURL, "Login không thành công");

        Assert.assertTrue(driver.findElement(By.xpath(LocatorCRM.menuDashboard)).isDisplayed(),
                "Không đến được trang Dashboard.");   // check menuDashboard đã hiển thị chưa
        sleep(1);
    }
    @Test(description ="sai email" )
    public void TestLoginWithEmailInvalid(){
        driver.get(InfoCRM.URL);
        waitForPageLoaded();
        setText(LocatorCRM.inputEmail, "admin@example123.com");
        setText(LocatorCRM.inputPassword, InfoCRM.Password);
        clickElement(LocatorCRM.buttonLogin);
        waitForPageLoaded();
        // sai Email, login không thành công
        boolean checkURL = driver.getCurrentUrl().contains("authentication");   //check URL hiện tại có chứa text "authentication" không
        Assert.assertTrue(checkURL, "Login thành công");

        // check element có tồn tại ko
        Assert.assertTrue(checkElementExist(LocatorCRM.headerLoginPage), "không ở lại trang Login");
        Assert.assertFalse(checkElementExist(LocatorCRM.menuDashboard), "đến được trang Dashboard."); //cách  1
//        Assert.assertFalse(driver.findElements(By.xpath(LocatorCRM.menuDashboard)).size()>0," đến được trang Dashboard.");    //cách 2

        // check alert message
        Assert.assertTrue(checkElementExist(LocatorCRM.alertMessage), "Fail, không hiển thị alert message ");
        Assert.assertEquals(getTextElement(LocatorCRM.alertMessage),"Invalid email or password", "sai alert message "); //cach 1
//        Assert.assertEquals(driver.findElement(By.xpath(LocatorCRM.alertMessage)),"Invalid email or password", "sai alert message "); //cach 2

        sleep(1);
    }
    @Test(description = "sai password")
    public void TestLoginWithPasswordInvalid(){
        driver.get(InfoCRM.URL);
        waitForPageLoaded();
        setText(LocatorCRM.inputEmail, InfoCRM.Email);
        setText(LocatorCRM.inputPassword, "1235");
        clickElement(LocatorCRM.buttonLogin);
        waitForPageLoaded();
        // sai Email, login không thành công
        boolean checkURL = driver.getCurrentUrl().contains("authentication");   //check URL hiện tại có chứa text "authentication" không
        Assert.assertTrue(checkURL, "Login thành công");

        // check element có tồn tại ko
        Assert.assertFalse(checkElementExist(LocatorCRM.menuDashboard), "đến được trang Dashboard.");
        Assert.assertTrue(checkElementExist(LocatorCRM.headerLoginPage), "không ở lại trang Login");
         // check alert message
        Assert.assertTrue(checkElementExist(LocatorCRM.alertMessage), "Fail, không hiển thị alert message ");
        Assert.assertEquals(getTextElement(LocatorCRM.alertMessage),"Invalid email or password", "sai alert message ");
        sleep(1);
    }
}
