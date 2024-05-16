package Bai24_Parameters_MultiBrowser;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// @Optional: truyền giá trị value mặc định
// Ưu tiên truyền giá trị của suite.xml, nếu không có/truyền sai giá trị bên suite.xml thì mới truyền giá trị mặc định

public class demoParameters {

    @Test
    @Parameters({"number 1", "number 2"})
    public void testSum01(@Optional("5") int a, @Optional("6") int b){
        System.out.println("Sum 01: " +(a + b));
    }

    @Test
    @Parameters({"number 1", "number 2"})
    public void testMul01(@Optional("10") int a, @Optional("6") int b){
        System.out.println("Mul 01: " +(a - b));
    }


}
