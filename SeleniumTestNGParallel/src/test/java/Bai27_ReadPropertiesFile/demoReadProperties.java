package Bai27_ReadPropertiesFile;

import constants.ConfigData;
import helpers.PropertiesHelper;
import org.testng.annotations.Test;

public class demoReadProperties {

//    Có thể đọc và lấy giá trị từ nhiều files
//    Nếu 2 file có trùng key thì sẽ lấy giá trị của file sau ghi đè lên file trước (theo thứ tự khi khai báo add file)
//    Nếu không chỉ định đường dẫn file trước khi Set file, mặc định giá trị sẽ được ghi vào file cuối cùng

    @Test
    public void testReadPropertiesFile(){
        PropertiesHelper.loadAllFiles();
        System.out.println(ConfigData.URL);
        System.out.println(PropertiesHelper.getValue("email"));
        System.out.println(PropertiesHelper.getValue("password"));

        // Set file
        PropertiesHelper.setFile("src/test/resources/configs/file2.properties");
        PropertiesHelper.setValue("message", "Add new key");
    }
}
