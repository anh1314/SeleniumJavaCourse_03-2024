package Bai20_ThuchanhPOM.Testcases;

import Bai20_ThuchanhPOM.Pages.DashboardPage;
import Bai20_ThuchanhPOM.Pages.LoginPage;
import Common.BaseTest;
import Constants.ConfigData;
import Keywords.WebUI;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;


    @Test
    public void testLoginSucess(){
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.Email, ConfigData.Password);
        waitForPageLoaded();
        loginPage.verifyLoginSuccess();
        dashboardPage.Logout();
    }
    @Test
    public void  testLoginWithEmailInvalid(){
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin@example123.com", ConfigData.Password);
        waitForPageLoaded();
        loginPage.verifyLoginFail();
        WebUI.captureScreenImage("testLoginWithEmailInvalid");
    }
    @Test
    public void  testLoginWithPasswordInvalid(){
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.Email, "123");
        waitForPageLoaded();
        loginPage.verifyLoginFail();
    }

}
