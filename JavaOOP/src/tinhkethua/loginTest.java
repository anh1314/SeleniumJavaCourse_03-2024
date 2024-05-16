package tinhkethua;

import tinhkethua.basetest.BaseTest;
// vd auto
public class loginTest extends BaseTest {
    public void testLoginSuccess(){
        createBrowser();
        System.out.println("Navigate to URL http...");
        System.out.println("Set email valid");
        System.out.println("Enter password valid");
        System.out.println("Click on Login button");
        System.out.println("Verify Login success");
        closeBrowser();
    }

    public void testLoginWithEmailInvalid(){
        createBrowser();
        System.out.println("Navigate to URL http...");
        System.out.println("Set email invalid");
        System.out.println("Enter password valid");
        System.out.println("Click on Login button");
        System.out.println("Verify Login fail");
        closeBrowser();
    }

    public static void main(String[] args) {
        loginTest loginTest = new loginTest();

        loginTest.testLoginSuccess();
        loginTest.testLoginWithEmailInvalid();
    }
}
