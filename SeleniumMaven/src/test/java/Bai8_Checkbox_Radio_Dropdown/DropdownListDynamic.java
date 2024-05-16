package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DropdownListDynamic extends BaseTest {
    public static void main(String[] args) {
        createBrownser();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(3);
        driver.findElement(By.xpath("(//b)[11]")).click();
        sleep(1);
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys("Ho");
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys(Keys.ENTER);
        closeBrownser();
    }
}
