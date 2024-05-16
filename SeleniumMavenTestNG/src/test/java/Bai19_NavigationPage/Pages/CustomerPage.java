package Bai19_NavigationPage.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomerPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By buttonAddNewCustomer = By.xpath("//a[normalize-space()='New Customer']");
    private By inputSearchCustomer = By.xpath("//input[@class='form-control input-sm']");

    public CustomerPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickButtonAddNewCustomer(){
        driver.findElement(buttonAddNewCustomer).click();
    }
    public void searchCustomer(String customerName){
        driver.findElement(inputSearchCustomer).sendKeys(customerName);
    }

}
