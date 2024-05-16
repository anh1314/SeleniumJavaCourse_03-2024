package Bai17_PageObjectModel.Testcases;

import Bai17_PageObjectModel.Pages.LoginPage;
import Common.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @Test
    public void testLoginSucess(){
        loginPage = new LoginPage(driver);  //khởi tạo đối tượng class
        loginPage.loginCRM("admin@example.com", "123456");  // lấy đối tượng class chấm gọi hàm
        waitForPageLoaded();    // dùng khi chuyển trang (load page)
        loginPage.verifyLoginSuccess();
    }
    @Test
    public void testLoginWithEmailInvalid(){
        loginPage = new LoginPage(driver);
        loginPage.loginCRM("admin@example123.com", "123456");
        loginPage.verifyLoginFail();
    }

}
