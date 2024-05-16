package Bai12_ActionsClass;
import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
// Actions class thuộc Selenium
public class demoActionsClass extends BaseTest {

        @Test   //sendKeys + click + Keys class (ENTER)
        public void TestPressEnterKey() {
            driver.get("https://www.google.com/");
            WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));   // Element search box
            Actions action = new Actions(driver);     // Tạo đối tượng của Actions class và để driver vào

            // Dùng action để gọi hàm sendkeys điền dữ liệu. Không dùng sendKeys của WebElement
//            action.sendKeys(element, "Anh Tester").perform();
//            action.sendKeys(Keys.ENTER).perform();

            // .build(): sử dụng khi có xử lý từ 2 action trở lên (ghép chuỗi 2 action)
            action.sendKeys(element, "Anh Tester").sendKeys(Keys.ENTER).build().perform();
//            action.sendKeys(element, "Anh Tester").pause(2000).sendKeys(Keys.ENTER).build().perform();  //pause(mili giây) = Thread.sleep

            WebElement elementTitlePage = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Anh Tester Automation Testing'])[2]"));     // Get element title of page
            action.click(elementTitlePage).build().perform();      // Gọi hàm click để click element trên
            sleep(2);
        }
    @Test   //doubleClick (lick 2 lần)
    public void doubleClick(){
        driver.get("https://anhtester.com/");
        WebElement element = driver.findElement(By.xpath("//div[@class='col-lg-7']//h2[@class='section__title'][contains(text(),'Anh Tester')]"));
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
        sleep(2);
    }
    @Test   //contextClick (lick chuột phải)
    public void contextClick() {
        driver.get("https://anhtester.com/");
        WebElement element = driver.findElement(By.xpath("//div[@class='col-lg-7']//h2[@class='section__title'][contains(text(),'Anh Tester')]"));
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
        sleep(2);
    }
    @Test   // moveToElement: di chuyển đến vị trí element chỉ định
    public void moveToElement() {
        driver.get("https://anhtester.com/");
        WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Kiến thức Automation Testing')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();      //di chuyển tới title Kiến thức Automation Testing
        sleep(2);
    }
    @Test   //dragAndDrop: kéo và thả
    public void demoDragAndDropWithActionClass() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement From = driver.findElement(By.xpath("//div[@id='box6']"));    // Bắt element cần kéo
        WebElement To = driver.findElement(By.xpath("//div[@id='countries']//div[1]"));  // Bắt element cần thả đến
        Actions action = new Actions(driver);
        action.dragAndDrop(From, To).perform();   // Kéo và thả
        sleep(2);
    }
    @Test   //KeyDown(đặt xuống)
    public void inputTextUppercase() {  //chuyển chữ thường thành chữ hoa
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("//*[@name='q']"));
        Actions action = new Actions(driver);

        // Đè giữ phím SHIFT và nhập text -> Chữ in hoa
        action.keyDown(element, Keys.SHIFT).sendKeys("anh tester").build().perform();
        sleep(2);
    }
    @Test   //keyDown + keyUp(nhấc lên)
    public void scrollPageDownAndUp() {
        driver.get("https://anhtester.com/");
        Actions action = new Actions(driver);
        // Scroll down
        action.keyDown(Keys.END).perform();
        action.keyUp(Keys.END).perform();
        sleep(2);
        // Scroll up
        action.keyDown(Keys.HOME).perform();
        action.keyUp(Keys.HOME).perform();
        sleep(2);
    }
    @Test //Ctrl + a > Ctrl + c > Ctrl + v (Copy Paste)
    public void copyAndPaste() throws InterruptedException {
        driver.get("https://anhtester.com/blogs");
        WebElement inputCourseElement = driver.findElement(By.xpath("//input[contains(@placeholder, 'Tìm kiếm khóa học')]"));
        WebElement inputBlogElement = driver.findElement(By.xpath("//input[contains(@placeholder, 'Tìm kiếm bài viết')]"));
        Actions action = new Actions(driver);
         inputCourseElement.sendKeys("Selenium");    // Nhập text vào ô search course
        //Ctrl + a để bôi đen
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        //Ctrl + c để copy
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        inputBlogElement.click();   //click vào ô Blog search
        //Ctrl + v để dán
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        sleep(2);

        // Làm mới trang: Ctrl+F5
        action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
        sleep(2);
    }
}


