package Bai14_JavascriptExecutor;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

// selenium có thể thao tác được đối với phần tử bị khuất bởi màn hình
//và KHÔNG thể thao tác được với phần tử bị che bởi một phần tử khác/ chưa load kịp(ko đủ time load)
public class demoJavascriptExecutor extends BaseTest {

    @Test
    public void JavascriptExecutor01(){
        driver.get("https://cms.anhtester.com/");

        // khởi tạo đối tượng web element
        By buttonCloseWelcomeDialog = By.xpath("//button[@data-key='website-popup']");
        WebElement menuBlogs = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));

        //sử dụng Javascript để thực thi click menuBlogs
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", menuBlogs);
    }
    @Test   // truyền giá trị vào ô search
    public void JavascriptExecutor02(){
        driver.get("https://cms.anhtester.com/");
        WebElement inputSearch = driver.findElement(By.xpath("//input[@id='search']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', 'Qua Tet');", inputSearch);
    }
    @Test
    public void JavascriptExecutor03(){
        driver.get("https://cms.anhtester.com/");
        WebElement buttonCloseWelcomeDialog = driver.findElement(By.xpath("//button[@data-key='website-popup']"));
        WebElement buttonViewAllCategories = driver.findElement(By.xpath("//a[normalize-space()='View All Categories']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // cuộn chuột lên trên cùng (đến vị trí Top của phần tử)
        js.executeScript("arguments[0].scrollIntoView(true);", buttonViewAllCategories);

        //cuộn trang theo chiều dọc 500px
        js.executeScript("window.scrollTo(0,500)");

        //Tô màu viền của Element
        js.executeScript("arguments[0].style.border='3px solid blue'", buttonCloseWelcomeDialog);
        sleep(2);
        buttonCloseWelcomeDialog.click();

        // cuộn chuột xuống dưới cùng (đến vị trí Bottom  của phần tử)
        js.executeScript("arguments[0].scrollIntoView(false);", buttonViewAllCategories);
        js.executeScript("arguments[0].style.border='3px solid blue'", buttonViewAllCategories);    // tô màu viền
        sleep(2);

        // lấy chiều cao và chiều rộng của web
        System.out.println("chieu cao: " +js.executeScript("return window.innerHeight;").toString());
        System.out.println("chieu rong: " +js.executeScript("return window.innerWidth;").toString());
    }
}
