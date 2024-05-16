package Bai28_ReadExcelFile;

import Bai26_CustomDriverParallelExecution.Pages.DashboardPage;
import Bai26_CustomDriverParallelExecution.Pages.LoginPage;
import Common.BaseTest;
import constants.ConfigData;
import helpers.ExcelHelper;
import keywords.WebUI;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test
    public void testLoginSucess() {
        loginPage = new LoginPage();
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/testdata/UsersData.xlsx", "sheet1");
        dashboardPage = loginPage.loginCRM(
                excelHelper.getCellData("email", 1),
                excelHelper.getCellData("password", 1)
        );
        loginPage.verifyLoginSuccess();
        dashboardPage.Logout();
    }

    @Test
    public void testLoginWithEmailInvalid() {
        loginPage = new LoginPage();
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/testdata/UsersData.xlsx", "sheet1");
        dashboardPage = loginPage.loginCRM(
                excelHelper.getCellData("email", 2),
                excelHelper.getCellData("password", 2)
        );        loginPage.verifyLoginFail();
        WebUI.captureScreenImage("testLoginWithEmailInvalid");
    }

    @Test
    public void testLoginWithPasswordInvalid() {
        loginPage = new LoginPage();
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/testdata/UsersData.xlsx", "sheet1");
        dashboardPage = loginPage.loginCRM(
                excelHelper.getCellData("email", 3),
                excelHelper.getCellData("password", 3)
        );
        loginPage.verifyLoginFail();
    }

}
