package Bai13_Alert_PopupWindow_iFrame;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Common.BaseTest;

public class HandleIFrame extends BaseTest {
    @Test
    public void testIFrame01() {
        driver.navigate().to("https://anhtester.com/contact");
       sleep(10);
        System.out.println("iframe total: " + driver.findElements(By.tagName("iframe")).size());
        //----Switch to content of Messenger--------
        driver.switchTo().frame(0); //Thẻ iframe thứ nhất
        System.out.println(driver.findElement(By.tagName("strong")).getText());
        //----Switch to icon of Messenger---------
        //1. Switch to Parent WindowHandle
        driver.switchTo().parentFrame(); //Chuyển về nội dung chính không thuộc iframe nào

        //2. Switch to iframe icon of Messenger
        driver.switchTo().frame(1); //Thẻ iframe thứ hai
        driver.findElement(By.tagName("svg")).click(); //Nhấn icon để ẩn messenger chat đi

        sleep(2);
    }
    @Test
    public void iFrameOnVNExpress(){
        driver.get("https://vnexpress.net/");
        sleep(12);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/27973503/Vnexpress/Desktop/Masthead/Home_0']")));
        int div = driver.findElements(By.xpath("(//div[contains(@id,'genecy_ifr_')])")).size();
        System.out.println(div);
        driver.findElement(By.xpath("(//div[contains(@id,'genecy_ifr_')])")).click();
        sleep(2);
    }
}
