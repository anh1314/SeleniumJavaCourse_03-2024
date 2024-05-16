import Common.BaseTest;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static keywords.WebUI.*;

public class DemoCMS extends BaseTest {
      @Test
      public void testLogin() {
            openURL("https://cms.anhtester.com/login");
            setText(By.xpath("//input[@id='email']"), "admin@example.com");
            setText(By.xpath("//input[@id='password']"), "123456");
            clickElement(By.xpath("//button[normalize-space()='Login']"));
            sleep(2);
      }

      @Test
      public void testCreateCategory() {
            openURL("https://cms.anhtester.com/login");
            setText(By.xpath("//input[@id='email']"), "admin@example.com");
            setText(By.xpath("//input[@id='password']"), "123456");
            clickElement(By.xpath("//button[normalize-space()='Login']"));
            clickElement(By.xpath("//button[@class='aiz-mobile-toggler']"));
            clickElement(By.xpath("//span[normalize-space()='Products']"));
            clickElement(By.xpath("//span[normalize-space()='Category']"));
            sleep(2);
      }
}
