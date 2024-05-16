package handleComponents;

import Common.BaseTest;
import constants.ConfigData;
import handleComponents.pages.CustomerPage;
import handleComponents.pages.DashboardPage;
import handleComponents.pages.LoginPage;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.LogUtils;

import java.util.ArrayList;

public class handlePagination_Table extends BaseTest {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;

    @Test
    public void testCheckDataOnTable_Pagination() {

        String searchValue = "Viettel";

        loginPage = new LoginPage();
        dashboardPage = loginPage.loginCRM(ConfigData.Email, ConfigData.Password);
        customerPage = dashboardPage.clickMenuCustomers();

        // Lấy số item hiển thị trên 1 trang
        Select select = new Select(WebUI.getWebElement(By.xpath("//select[@name='clients_length']")));

        select.selectByVisibleText("10");
        WebUI.sleep(1);

        LogUtils.info(select.getFirstSelectedOption().getText());

        int itemTotalOnePage = Integer.parseInt(select.getFirstSelectedOption().getText());
        System.out.println("Tổng số item / trang: " + itemTotalOnePage);

        //Set Text on Search input
        //WebUI.setText(By.xpath("//input[@type='search']"), searchValue);
        customerPage.searchCustomerOnTable(searchValue); //Tra ra 26 items

        //Lấy tổng số item hiển thị khi tìm kiếm
        String strTotal = WebUI.getElementText(By.xpath("//div[@id='clients_info']"));
        ArrayList<String> list = new ArrayList<String>();

//        \\s là khoảng trắng
        for (String strItem : strTotal.split("\\s")) {
            list.add(strItem);
        }

        System.out.println(list);

        //chuyển đổi một chuỗi số ở vị trí thứ 5 của danh sách thành một số nguyên và gán cho biến itemTotal.
        int itemTotal = Integer.parseInt(list.get(5));  // Integer.parseInt: chuyển dạng chuỗi về dạng số nguyên
        System.out.println("Tổng số item: " + itemTotal);
        int pageTotal = itemTotal / itemTotalOnePage;
        int sodu = itemTotal % itemTotalOnePage;
        System.out.println("Tổng số nguyên: " + pageTotal);
        System.out.println("Tổng số dư: " + sodu);

        if (sodu > 0) {
            pageTotal = pageTotal + 1;
        }

        System.out.println("Tổng số Page: " + pageTotal);

        for (int i = 1; i <= pageTotal; i++) {
            customerPage.checkSearchTableByColumn(3, searchValue);

            //Nhấn nút Next để đến trang tiếp theo
            if (i < pageTotal) {
                WebUI.clickElement(By.xpath("//a[normalize-space()='Next']"));
                WebUI.sleep(2);
            }
        }

    }

}