package handleComponents;

import Common.BaseTest;
import constants.ConfigData;
import handleComponents.pages.CustomerPage;
import handleComponents.pages.DashboardPage;
import handleComponents.pages.LoginPage;
import org.testng.annotations.Test;

public class handleTable__CustomerCRM extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;

    @Test
    public void testCheckDataOnTable(){
        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM(ConfigData.Email, ConfigData.Password);
        customerPage = dashboardPage.clickMenuCustomers();
        customerPage.searchCustomerOnTable("Viettel"); //Tra ra 25 records /page
        //customerPage.checkPageTotal(5);
        customerPage.checkSearchTableByColumn(3, "Viettel"); //So sanh contains
    }
}
