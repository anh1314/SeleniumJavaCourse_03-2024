package Bai7_WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demo_AdvancedBrowserOperations {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://crm.anhtester.com/admin/authentication");

        // Ví dụ thiết lập 10 giây cho tất cả
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        // add cookie (bỏ qua Login)
        Cookie cookie = new Cookie("sp_session", "3d0119d47174cd0fa5078185d33b2456cb0e3608");
        driver.manage().addCookie(cookie);
        // cách 2 khai báo khởi tạo cookie
        //driver.manage().addCookie(new Cookie("sp_session", "3d0119d47174cd0fa5078185d33b2456cb0e3608"));
        driver.navigate().refresh();

        // lấy all cookie
        System.out.println(driver.manage().getCookieNamed("sp_session"));
        // lấy 1 trong tất cả cookie
        System.out.println(driver.manage().getCookieNamed("sp_session").getName());

        Thread.sleep(2000);
        driver.quit();
    }
}
