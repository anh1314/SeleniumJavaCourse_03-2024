package Bai19_NavigationPage.Testcases;

import Bai19_NavigationPage.Pages.CustomerPage;
import Bai19_NavigationPage.Pages.DashboardPage;
import Bai19_NavigationPage.Pages.LoginPage;
import Common.BaseTest;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;

    @Test
    public void testOpenCustomerPage(){
        // Login
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM("admin@example.com", "123456");
        // xảy ra chuyển trang
       customerPage = dashboardPage.clickMenuCustomers();
       // chuyển sang trang customer
        customerPage.clickButtonAddNewCustomer();

    }
}
