package Bai26_CustomDriverParallelExecution.Testcases;

import Bai26_CustomDriverParallelExecution.Pages.CustomerPage;
import Bai26_CustomDriverParallelExecution.Pages.DashboardPage;
import Bai26_CustomDriverParallelExecution.Pages.LoginPage;
import Common.BaseTest;
import constants.ConfigData;
import org.testng.annotations.Test;

public class CustomerTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;

    @Test
    public void testAddNewCustomer(){
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM(ConfigData.Email, ConfigData.Password );
        loginPage.verifyLoginSuccess();

        customerPage = dashboardPage.clickMenuCustomers();
        customerPage.verifyHeaderCustomerPage();

        customerPage.clickButtonAddNew();

        String CUSTOMER_NAME = "FPT Software A6";
        customerPage.inputFormData(CUSTOMER_NAME); //Add new and Save
        dashboardPage.clickMenuCustomers();
        customerPage.searchAndVerifyCustomer(CUSTOMER_NAME); //Search and Verify on table
        customerPage.verifyCustomerDetail(CUSTOMER_NAME); //Verify Detail

    }
}
