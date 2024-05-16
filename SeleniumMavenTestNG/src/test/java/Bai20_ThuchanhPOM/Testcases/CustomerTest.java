package Bai20_ThuchanhPOM.Testcases;

import Bai20_ThuchanhPOM.Pages.CustomerPage;
import Bai20_ThuchanhPOM.Pages.DashboardPage;
import Bai20_ThuchanhPOM.Pages.LoginPage;
import Common.BaseTest;
import Constants.ConfigData;
import org.testng.annotations.Test;

public class CustomerTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;

    @Test
    public void testAddNewCustomer(){
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.loginCRM(ConfigData.Email, ConfigData.Password );
        loginPage.verifyLoginSuccess();

        customerPage = dashboardPage.clickMenuCustomers();
        customerPage.verifyHeaderCustomerPage();

        customerPage.clickButtonAddNewCustomer();

        String CUSTOMER_NAME = "FPT Software A6";
        customerPage.inputFormData(CUSTOMER_NAME); //Add new and Save
        customerPage.searchAndVerifyCustomer(CUSTOMER_NAME); //Search and Verify on table
        customerPage.verifyCustomerDetail(CUSTOMER_NAME); //Verify Detail

    }
}
