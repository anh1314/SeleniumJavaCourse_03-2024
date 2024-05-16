package Bai29_DataProvider;

import dataProvider.DataProviderFactory;
import helpers.ExcelHelper;
import org.apache.poi.sl.usermodel.ObjectData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class demoDataProvider {

//     Khi lưu trữ data trong file excel thì nên dùng kiểu chuỗi
//    Để chuyển từ số về chuỗi trong excel thì thêm dấu nháy' vào trước số (vd '123), sửa ở file excel
//    gọi dataProvider ở @Test = name của @DataProvider
//    tham số data phải đồng bộ về cả số lượng và kiểu dữ liệu
//    chạy song song DataProvider: parallel = true, chạy tuần tự: parallel = false

    @DataProvider(name = "DataLogin", parallel = true)
    public Object[][] dataLogin(){
        return new Object[][]{
                {"admin@example.com",  123456},
                {"customer@example.com", 123456},
                {"employee@example.com", 123456}
        };
    }

    @Test(dataProvider = "DataLogin")
    public void testLogin(String email, int password){
        System.out.println("Email: " +email);
        System.out.println("Password " +password);
    }

//    gọi DataProvider từ class DataProviderFactory: dataProviderClass = (class chứa data).class
    @Test(dataProvider = "DataLogin", dataProviderClass = DataProviderFactory.class)
    public void testLogin(String email, String password){
        System.out.println("Email: " +email);
        System.out.println("Password " +password);
    }

    @Test(dataProvider = "data_provider_login_excel_hashtable", dataProviderClass = DataProviderFactory.class)
    public void testLoginDataFromExcelMultipleRow(Hashtable<String, String> data){
        System.out.println("Email: " +data.get("EMAIL"));
        System.out.println("Password " +data.get("PASSWORD"));
    }
}
