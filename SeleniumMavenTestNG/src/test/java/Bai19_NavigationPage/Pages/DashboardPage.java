package Bai19_NavigationPage.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By menuDashboard = By.xpath("//span[normalize-space()='Dashboard']");
    private By menuCustomers = By.xpath("//span[normalize-space()='Customers']");
    private By menuProjects = By.xpath("//span[normalize-space()='Projects']");
    private By dropdownProfile = By.xpath("//li[contains(@class, 'icon header-user-profile')]");
    private By optionLogout = By.xpath("//ul[@class='dropdown-menu animated fadeIn']//li[@class='header-logout']//a[@href='#'][normalize-space()='Logout']");

    // Constructor
    public DashboardPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public  void  clickMenuDashboard(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuDashboard));
        driver.findElement(menuDashboard).click();
    }
    public  CustomerPage  clickMenuCustomers(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuCustomers));
        driver.findElement(menuCustomers).click();
        return new CustomerPage(driver);
    }
    public  void  clickMenuProjects(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuProjects));
        driver.findElement(menuProjects).click();
    }
    public LoginPage  Logout(){
        driver.findElement(dropdownProfile).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(optionLogout));
        driver.findElement(optionLogout).click();
        return new LoginPage(driver);
    }
}
