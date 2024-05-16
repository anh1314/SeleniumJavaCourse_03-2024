package Bai30_TakeScreenshot_RecordVideo;

import Bai26_CustomDriverParallelExecution.Pages.LoginPage;
import Common.BaseTest;
import helpers.CaptureHelper;
import helpers.ExcelHelper;
import org.testng.annotations.Test;

public class demoTakeScreenshot extends BaseTest {

    LoginPage loginPage;

    @Test
    public void testLoginCRM_Success() {
        System.out.println("=====testLoginCRM_Success=====");
//        CaptureHelper.startRecord("testLoginCRM_Success");

        loginPage = new LoginPage();

        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/testdata/UsersData.xlsx", "Sheet1");

        loginPage.loginCRM(
                excelHelper.getCellData("email", 1),
                excelHelper.getCellData("password", 1)
        );

//        CaptureHelper.takeScreenshot("testLoginCRM_Success");
//
//        CaptureHelper.stopRecord();

        loginPage.verifyLoginSuccess();

    }

    @Test
    public void testLoginCRM_Fail() {
        System.out.println("=====testLoginCRM_Success=====");
//        CaptureHelper.startRecord("testLoginCRM_Fail");

        loginPage = new LoginPage();

        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/testdata/UsersData.xlsx", "Sheet1");

        loginPage.loginCRM(
                excelHelper.getCellData("EMAIL", 2),
                excelHelper.getCellData("PASSWORD", 2)
        );

        //CaptureHelper.takeScreenshot("testLoginCRM_Fail");

        //CaptureHelper.stopRecord();

        loginPage.verifyLoginSuccess();

    }

}