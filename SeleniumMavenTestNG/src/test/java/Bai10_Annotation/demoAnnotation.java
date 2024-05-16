package Bai10_Annotation;

import Common.BaseTest;
import org.testng.annotations.*;
//Khi bắt đầu thì mở từ Suite > Test > Group > Class > Method
//Khi kết thúc thì đóng từ Method > Class > Group > Test > Suite

// @BeforeSuite -  @BeforeTest - @BeforeGroups - @BeforeClass -  @BeforeMethod - @Test
// nếu không dùng priority thì mặc định testcase chạy từ A-Z

//BeforeTest và BeforeClass không dùng chung trong 1 class (chỉ cần sử dụng 1 trong 2)
//@BeforeSuite chỉ cần khởi tạo 1 lần ở class BaseTest (để kế thừa)

public class demoAnnotation extends BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeGroups(groups = { "testOne" } )
    public void beforeGroupOne() {
        System.out.println("Before Group testOne");
    }

    @AfterGroups(groups = { "testOne" })
    public void afterGroupOne() {
        System.out.println("After Group testOne");
    }

    @BeforeGroups(groups = { "testTwo" })
    public void beforeGroupTwo() {
        System.out.println("Before Group testTwo");
    }

    @AfterGroups(groups = { "testTwo" })
    public void afterGroupTwo() {
        System.out.println("After Group testTwo");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(groups = { "testOne" }, priority = 1)
    public void testOneMethod() {
        System.out.println("Test method 1");
    }

    @Test(groups = { "testTwo" }, priority = 2)
    public void testTwoMethod() {
        System.out.println("Test method 2");
    }
    @Test(groups = { "testThree" }, priority = 3)
    public void testThreeMethod() {
        System.out.println("Test method 3");
    }

    @Test(groups = { "testFour" }, priority = 4)
    public void testFourMethod() {
        System.out.println("Test method 4");
    }

}
