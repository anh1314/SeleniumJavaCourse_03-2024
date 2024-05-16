package Bai15_Waits;
import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

// đối tượng By: thiết lập cấu trúc tìm kiếm, nhưng chưa thực hiện tìm kiếm
// đối tượng WebElement: thực hiện tìm kiếm với đúng cú pháp thiết lập
public class demoExplicitWait extends BaseTest {
    @Test
    public void ExplicitWait01(){
        driver.get("https://hrm.anhtester.com/");
        //Set timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("iusername")).sendKeys("admin_example");
        driver.findElement(By.id("ipassword")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

       //visibilityOfElementLocated(): kiểm tra xem một phần tử có tồn tại trong DOM của một trang và hiển thị hay không
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Projects')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();//Click menu dự án
        sleep(2);

        //visibilityOf():  kiểm tra xem một phần tử hiện diện trên DOM của một trang có hiển thị hay không
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[normalize-space()='Tasks']"))));
    }

}
