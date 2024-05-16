package Bai26_CustomDriverParallelExecution.Testcases;

import Bai26_CustomDriverParallelExecution.Pages.DashboardPage;
import Bai26_CustomDriverParallelExecution.Pages.LoginPage;
import Common.BaseTest;
import constants.ConfigData;
import helpers.CaptureHelper;
import helpers.ExcelHelper;
import keywords.WebUI;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test
    public void testLoginSucess() {
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM(ConfigData.Email, ConfigData.Password);
        loginPage.verifyLoginSuccess();
        dashboardPage.Logout();
    }

    @Test
    public void testLoginWithEmailInvalid() {
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM("admin@example123.com", ConfigData.Password);
        loginPage.verifyLoginFail();
        WebUI.captureScreenImage("testLoginWithEmailInvalid");
    }

    @Test
    public void testLoginWithPasswordInvalid() {
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM(ConfigData.Email, "123");
        loginPage.verifyLoginFail();
    }

}
