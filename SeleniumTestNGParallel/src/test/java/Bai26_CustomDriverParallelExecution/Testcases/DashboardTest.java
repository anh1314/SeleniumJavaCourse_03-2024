package Bai26_CustomDriverParallelExecution.Testcases;

import Bai26_CustomDriverParallelExecution.Pages.CustomerPage;
import Bai26_CustomDriverParallelExecution.Pages.DashboardPage;
import Bai26_CustomDriverParallelExecution.Pages.LoginPage;
import Common.BaseTest;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;

    @Test
    public void testOpenCustomerPage() {
        // Login
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM("admin@example.com", "123456");
        loginPage.verifyLoginSuccess();

        // xảy ra chuyển trang
        customerPage = dashboardPage.clickMenuCustomers();
        customerPage.verifyHeaderCustomerPage();
    }

    @Test
    public void testAdminRole() {
        // Login
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM("admin@example.com", "123456");
        loginPage.verifyLoginSuccess();

        dashboardPage.verifyMenuReportDisplay();
    }

    @Test
    public void testProjectRole() {
        // Login
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM("project@example.com", "123456");
        loginPage.verifyLoginSuccess();

        dashboardPage.verifyMenuReportNotDisplay();
    }
}
