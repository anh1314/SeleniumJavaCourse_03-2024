package anhtester.com.javabasic.phuongthuc;

public class Bank {
    static String BANKNAME = "Vietinbank";
    static String ADDRESS = "Can Tho";
    static String PHONE = "083929222";
    static float INTEREST_RATE = 7.3F;

    //Ham khong tra ve
    public static void getBankInfo(){
        System.out.println("bank name:" +BANKNAME);
        System.out.println("bank adress:" +ADDRESS);
        System.out.println("bank phone:" +PHONE);
        System.out.println("bank interest rate:" +INTEREST_RATE);


        }
    //Ham tra ve
    public static float getInterestRate(){
        return INTEREST_RATE;

    }



}
