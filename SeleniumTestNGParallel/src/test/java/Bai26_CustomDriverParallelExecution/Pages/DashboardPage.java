package Bai26_CustomDriverParallelExecution.Pages;

import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DashboardPage {

    private By menuDashboard = By.xpath("//span[normalize-space()='Dashboard']");
    private By menuCustomers = By.xpath("//span[normalize-space()='Customers']");
    private By menuProjects = By.xpath("//span[normalize-space()='Projects']");
    private By dropdownProfile = By.xpath("//li[contains(@class, 'icon header-user-profile')]");
    private By optionLogout = By.xpath("//ul[@class='dropdown-menu animated fadeIn']//li[@class='header-logout']//a[@href='#'][normalize-space()='Logout']");
    private By menuReports = By.xpath("//span[normalize-space()='Reports']");

    public void clickMenuDashboard() {
        WebUI.clickElement(menuDashboard);
    }

    public CustomerPage clickMenuCustomers() {
        WebUI.clickElement(menuCustomers);
        return new CustomerPage();
    }

    public void clickMenuProjects() {
        WebUI.clickElement(menuProjects);
    }

    public void verifyMenuReportDisplay() {
        Assert.assertTrue(WebUI.checkElementExist(menuReports), "menu Report not display");
    }

    public void verifyMenuReportNotDisplay() {
        Assert.assertFalse(WebUI.checkElementExist(menuReports), "menu Report is displayed");
    }

    public LoginPage Logout() {
        WebUI.clickElement(dropdownProfile);
        WebUI.clickElement(optionLogout);
        return new LoginPage();
    }
}
