package Bai8_Checkbox_Radio_Dropdown;

import Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdownStatic extends BaseTest {
    public static void main(String[] args) {
        createBrownser();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

   // xử lý dropdown list tĩnh
        //khai báo dropdown
        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        System.out.println(  select.getFirstSelectedOption().getText());

        // dùng văn bản hiển thị Visible text()
        select.selectByVisibleText("Tuesday");
        sleep(5);

        // Kiểm tra giá trị trong dropdown hiển thị đúng sau khi chọn
        System.out.println( select.getFirstSelectedOption().getText());

        // dùng vị trí index
        select.selectByIndex(4); //Wednesday
        System.out.println( select.getFirstSelectedOption().getText());

        // dùng giá trị value
        select.selectByValue("Saturday");
        System.out.println( select.getFirstSelectedOption().getText());

        //Kiểm tra tất cả giá trị trong list dropdown hiển thị đúng sau khi chọn
        List<WebElement> listOption = select.getAllSelectedOptions();
        for (WebElement element : listOption ){
            System.out.println("\n getAll: " +element.getText());
        }

        // select Multiple
        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        selectMultiple.selectByIndex(1);
        selectMultiple.selectByIndex(2);
        selectMultiple.selectByIndex(3);
        List<WebElement> listOptionMultiple =selectMultiple.getAllSelectedOptions();
        for (WebElement element : listOptionMultiple){
            System.out.println(" getAll Multiple: " +element.getText());
        }
        

        // so sánh 2 giá trị có bằng nhau không:   Assert.assertEquals(select.getFirstSelectedOption().getText(), "Tuesday");

        closeBrownser();
    }
}
