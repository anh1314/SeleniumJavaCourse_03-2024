package handleComponents;

import Common.BaseTest;
import helpers.SystemHelper;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile extends BaseTest {

    @Test
    public void testUploadFileWithSendKeys()  {
        WebUI.openURL("https://cgi-lib.berkeley.edu/ex/fup.html");
        By inputFileUpload = By.xpath("//input[@name='upfile']");
        WebUI.setText(inputFileUpload,System.getProperty("user.dir") + "src/test/resources/testdata/lenovo.jpg");
//      hoặc:  "src\\test\\resources\\testdata\\lenovo.jpg"
    }

    @Test
    public void testUploadFile2() {
        WebUI.openURL("https://files.fm/");

        By textOnPage = By.xpath("//div[@id='file_select_dragndrop_text']");
        By divFileUpload = By.xpath("//div[@id='uploadifive-file_upload']");
        By inputFileUpload = By.xpath("//div[@id='file_select_button']//input[@id='file_upload']");

        String filePath = SystemHelper.getCurrentDir() + "src\\test\\resources\\testdata\\lenovo.jpg";

        //Click để mở form upload
        WebUI.getWebElement(divFileUpload).click();

        // Khởi tạo Robot class
        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Copy File path vào Clipboard
        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // Nhấn Control+V để dán
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // Xác nhận Control V trên
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // Nhấn Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        By fileName = By.xpath("//span[@class='filename']");
        Assert.assertTrue(WebUI.checkElementExist(fileName), "The file can not upload");
    }
}
