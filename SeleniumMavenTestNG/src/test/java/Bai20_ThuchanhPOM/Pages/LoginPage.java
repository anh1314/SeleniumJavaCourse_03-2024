package Bai20_ThuchanhPOM.Pages;

import Constants.ConfigData;
import Keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    // khai báo driver cục bộ trong class
    private WebDriver driver;
    WebDriverWait wait;

    // khai báo các element dạng đối tượng By
    private By headerPage = By.xpath("//h1[normalize-space()='Login']");
    private By inputEmail = By.xpath("//input[@id='email']");
    private By inputPassword= By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    private By alertMessage = By.xpath("//div[@id='alerts']");

    // khai báo hàm xây dựng để truyền driver từ bên ngoài vào class này sử dụng
    public  LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        new WebUI(driver);
    }
    // tách hàm xử lý chính ra
    private void setEmail(String email){
        WebUI.setText(inputEmail, email);
    }
    private void setPassword(String password){
        WebUI.setText(inputPassword, password);
    }
    private void clickLoginButton(){
      WebUI.clickElement(buttonLogin);
    }
    // các hàm xử lý chính trong page
    public DashboardPage loginCRM(String email, String password){
        WebUI.openURL(ConfigData.URL);     // gọi từ class ConfigData dạng biến static
        WebUI.waitForPageLoaded();
        setEmail(email);
        setPassword(password);
        clickLoginButton();
        return new DashboardPage(driver);
    }
    //Assert
    public void verifyLoginSuccess(){
        Assert.assertFalse(driver.getCurrentUrl().contains("authentication"), "Fail, vẫn ở trang Login, login ko thành công");
    }
    public void verifyLoginFail(){
        Assert.assertTrue(driver.getCurrentUrl().contains("authentication"), "Fail, ko ở trang Login, login thành công");
        Assert.assertTrue(driver.findElement(alertMessage).isDisplayed(), "alertMessage not displays");
        Assert.assertEquals(WebUI.getElementText(alertMessage), "Invalid email or password", "hiển thị sai alertMessage");
    }

}
