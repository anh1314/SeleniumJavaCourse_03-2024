package Bai19_NavigationPage.Testcases;

import Bai19_NavigationPage.Pages.DashboardPage;
import Bai19_NavigationPage.Pages.LoginPage;
import Common.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage; //khai báo đối tượng dashboardPage
    // lấy đối tượng trang Login chuyển hướng đến (dashboardPage) = trang xảy ra chuyển trang ngay tại đó (loginPage)

    @Test
    public void testLoginSucess(){
        loginPage = new LoginPage(driver);  //khởi tạo đối tượng class
        dashboardPage = loginPage.loginCRM("admin@example.com", "123456");  // lấy đối tượng class chấm gọi hàm

        // tương tự như trên
//        loginPage.loginCRM("admin@example.com", "123456")
//        dashboardPage = new DashboardPage(driver);
//        dashboardPage.Logout();

        waitForPageLoaded();    // dùng khi chuyển trang (load page)
        loginPage.verifyLoginSuccess();
        // liên kết trang với LoginPage
        dashboardPage.Logout(); //logout từ trang Dashboard

        // vì đối tượng loginPage đã được khởi tạo nên khi liên kết trang không cần sử dụng:
//        loginPage = dashboardPage.Logout();
    }


}
