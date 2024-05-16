package Bai13_Alert_PopupWindow_iFrame;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Common.BaseTest;

import javax.swing.*;

//driver.switchTo().alert().dismiss(); nhấp Cancel
//driver.switchTo().alert().accept(); nhấp OK
//driver.switchTo().alert().getText(); get text
//driver.switchTo().alert().sendKeys("Text"); nhập dữ liệu vào ô input
public class handleAlert extends BaseTest {

    @Test   //accept, getText
    public void demoHandleAlertAccept() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        //Mở Alert Message, click vào nút "Click me!" thứ nhất
        driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
        Alert alert1 = driver.switchTo().alert();   //Khởi tạo class Alert

        String message = alert1.getText(); //getText alert
        System.out.println(message);
        Assert.assertEquals(message, "I am an alert box!", "message hien thi sai");
        sleep(1);
        alert1.accept();
        sleep(2);
    }
    @Test   //dismiss
    public void demoHandleAlertDismiss() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        //Mở Alert Dismiss, click vào nút "Click me!" thứ 2
        driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        //driver.switchTo().alert().dismiss();

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='confirm-demo']")).isDisplayed(),
                "Chưa nhấn được nút Cancel");
        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText(),
                "You pressed Cancel!", "not pressed cancel" );
        sleep(1);
    }
    @Test   //sendKeys
    public void demoHandleAlertInputText() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
       //Mở Alert Input text, click nút thứ 3
        driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Anh Tester Demo Alert");
        alert3.accept();
        // lăn chuột xuống vị trí element
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.xpath("//p[@id='prompt-demo']"))).perform();

        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText(),
                "You have entered 'Anh Tester Demo Alert' !",
                "Chưa điền được text");

        sleep(2);
    }
}
