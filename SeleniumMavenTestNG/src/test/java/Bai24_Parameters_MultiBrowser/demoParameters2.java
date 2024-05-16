package Bai24_Parameters_MultiBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoParameters2 {

    @Test
    @Parameters({"number 1", "number 2"})
    public void testSum01(int a, int b){
        System.out.println("Sum 02: " +(a + b));
    }

    @Test
    @Parameters({"number 1", "number 2"})
    public void testMul01(int a, int b){
        System.out.println("Mul 02: " +(a - b));
    }


}
