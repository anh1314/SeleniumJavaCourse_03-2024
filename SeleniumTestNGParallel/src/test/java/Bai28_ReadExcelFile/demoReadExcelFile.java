package Bai28_ReadExcelFile;

import helpers.ExcelHelper;
import org.testng.annotations.Test;

public class demoReadExcelFile {

    @Test
    public void testReadExcelFile(){

//        Khởi tạo đối tượng class excelHelper
        ExcelHelper excelHelper = new ExcelHelper();

//        Gọi hàm setExcelFile
        excelHelper.setExcelFile("src/test/resources/testdata/UsersData.xlsx", "sheet1");

//        Gọi hàm getCellData để lấy giá trị của từng ô trong excel file
        System.out.println(excelHelper.getCellData("email", 1));
        System.out.println(excelHelper.getCellData("password", 1));
        System.out.println(excelHelper.getCellData(2, 1));
    }

//     Khi ghi data vào file excel, cần close file trước khi chạy code

    @Test
    public void testSetDataToExcel(){
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/testdata/UsersData.xlsx", "sheet1");

        // ghi data vào file excel
        excelHelper.setCellData("Success", 3, 1 );
        excelHelper.setCellData("Fail", "status", 2 );
    }
}
