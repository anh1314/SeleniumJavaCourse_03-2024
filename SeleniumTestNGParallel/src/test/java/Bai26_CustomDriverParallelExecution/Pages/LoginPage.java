package Bai26_CustomDriverParallelExecution.Pages;

import constants.ConfigData;
import drivers.DriverManager;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage {

    // khai báo các element dạng đối tượng By
    private By headerPage = By.xpath("//h1[normalize-space()='Login']");
    private By inputEmail = By.xpath("//input[@id='email']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    private By alertMessage = By.xpath("//div[@id='alerts']");


    // tách hàm xử lý chính ra
    private void setEmail(String email) {
        WebUI.setText(inputEmail, email);
    }

    private void setPassword(String password) {
        WebUI.setText(inputPassword, password);
    }

    private void clickLoginButton() {
        WebUI.clickElement(buttonLogin);
    }

    // các hàm xử lý chính trong page
    public DashboardPage loginCRM(String email, String password) {
        WebUI.openURL(ConfigData.URL);     // gọi từ class ConfigData dạng biến static
        WebUI.waitForPageLoaded();
        setEmail(email);
        setPassword(password);
        clickLoginButton();
        return new DashboardPage();
    }

    //Assert
    public void verifyLoginSuccess() {
        WebUI.waitForPageLoaded();
        Assert.assertFalse(DriverManager.getDriver().getCurrentUrl().contains("authentication"), "Fail, vẫn ở trang Login, login ko thành công");
    }

    public void verifyLoginFail() {
        WebUI.waitForPageLoaded();
        Assert.assertTrue(DriverManager.getDriver().getCurrentUrl().contains("authentication"), "Fail, ko ở trang Login, login thành công");
        Assert.assertTrue(DriverManager.getDriver().findElement(alertMessage).isDisplayed(), "alertMessage not displays");
        Assert.assertEquals(WebUI.getElementText(alertMessage), "Invalid email or password", "hiển thị sai alertMessage");
    }

}
