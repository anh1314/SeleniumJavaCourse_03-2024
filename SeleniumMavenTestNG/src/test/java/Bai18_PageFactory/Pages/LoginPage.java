package Bai18_PageFactory.Pages;

import Constants.ConfigData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class LoginPage {
    // khai báo driver cục bộ trong class
    private WebDriver driver;
    WebDriverWait wait;

    // khai báo các element dạng đối tượng By
//    private By headerPage = By.xpath("//h1[normalize-space()='Login']");
//    private By inputEmail = By.xpath("//input[@id='email']");
//    private By inputPassword= By.xpath("//input[@id='password']");
//    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
//    private By alertMessage = By.xpath("//div[@id='alerts']");

    // khai báo các element dạng đối tượng WebElement
    @FindBy(xpath = "//h1[normalize-space()='Login']")
    WebElement headerPage;
    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement buttonLogin;
    @FindBy(xpath = "//div[@id='alerts']")
    WebElement alertMessage;
    @FindBys(@FindBy(xpath = "//ul[@id='side-menu']"))
    List<WebElement> listMenu;
    @FindAll({
            @FindBy(xpath = "//span[normalize-space()='Customers123']"),
            @FindBy(xpath = "//ul[@id='side-menu']/li[3]")
    })  WebElement menuCustomer;


    // khai báo hàm xây dựng để truyền driver từ bên ngoài vào class này sử dụng
    public  LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // khởi tạo giá trị cho các đối tượng web element (thực thi tìm kiếm)
        PageFactory.initElements(driver, this);
    }
    private void getMenuList(){
        for (WebElement menu : listMenu){
            System.out.println(menu.getText());
        }
    }


    // tách hàm xử lý chính ra để thiết lập cơ chế wait
    private void setEmail(String email){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail));
//        driver.findElement(inputEmail).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.sendKeys(email);

    }
    private void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
       inputPassword.sendKeys(password);
    }
    private void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(buttonLogin));
        buttonLogin.click();
    }

    // các hàm xử lý chính trong page
    public void loginCRM(String email, String password){
        driver.get(ConfigData.URL);     // gọi từ class ConfigData dạng biến static
        setEmail(email);
        setPassword(password);
        clickLoginButton();
        getMenuList();
        menuCustomer.click();
    }
    //Assert
    public void verifyLoginSuccess(){
        Assert.assertFalse(driver.getCurrentUrl().contains("authentication"), "Fail, vẫn ở trang Login, login ko thành công");
    }
    public void verifyLoginFail(){
        Assert.assertTrue(driver.getCurrentUrl().contains("authentication"), "Fail, ko ở trang Login, login thành công");
        Assert.assertTrue(alertMessage.isDisplayed(), "alertMessage not displays");
        Assert.assertEquals(alertMessage.getText(), "Invalid email or password", "hiển thị sai alertMessage");
    }

}
