package anhtester.com.javabasic.toantu;

public class toantuLogic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean checkValue1 = (a > 1) && (b < 2); //false
        boolean checkValue2 = (a > 1) || (b < 2); //true

        System.out.println(checkValue1);
        System.out.println(checkValue2);
    }

}
