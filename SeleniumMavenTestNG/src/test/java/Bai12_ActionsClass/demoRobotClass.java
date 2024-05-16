package Bai12_ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import Common.BaseTest;

import javax.imageio.ImageIO;

// Robot class thuộc Java
// keyPress: nhấn phím, keyRelease: thả phím
//mousePress: nhấn chuột, mouseRelease: thả chuột
public class demoRobotClass extends BaseTest {
    @Test
    public void inputText() throws AWTException {
        driver.get("https://anhtester.com/");
        WebElement inputCourseElement = driver.findElement(By.name("key"));
        inputCourseElement.click();
        Robot robot = new Robot();
        // Nhập từ khóa selenium (đè từng phím)
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_ENTER);  //nhấn Enter
        sleep(2);
    }
    @Test //mousePress, mouseRelease, mouseMove
    public void mousePress() throws AWTException {
        driver.get("https://anhtester.com/");
        Robot robot = new Robot();
        robot.mouseMove(1400, 200);     //Di chuyển trỏ chuột đến vị trí x,y
        robot.delay(1000);   //Dalay giống slee
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);   //Click chuột trái
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);     //Thả chuột trái ra
        sleep(2);
    }
    @Test
    public void createScreenCapture() throws InterruptedException, AWTException, IOException {

        driver.get("https://anhtester.com/");
        Thread.sleep(1000);

        Robot robot = new Robot();

        //Get size screen browser
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize);
        //Khởi tạo kích thước khung hình với kích cỡ trên
        Rectangle screenRectangle = new Rectangle(screenSize);
        //Tạo hình chụp với độ lớn khung đã tạo trên
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        //Lưu hình vào dạng file với dạng png
        File file = new File("TestImageRobot.png");
        ImageIO.write(image, "png", file);

        Thread.sleep(1000);
    }
    @Test
    public void screen() throws AWTException {
        driver.get("https://anhtester.com/");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PRINTSCREEN);


    }
}

