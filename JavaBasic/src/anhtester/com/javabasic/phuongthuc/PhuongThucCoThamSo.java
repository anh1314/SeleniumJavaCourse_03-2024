package anhtester.com.javabasic.phuongthuc;

public class PhuongThucCoThamSo {
// Phương thức có tham số
    static float INTEREST_RATE = 7.3F;
    public static double tinhLai(long soTienGui){
        return ((soTienGui*INTEREST_RATE)/100);
    }

    // Cộng 2 số
    public static double Cong2so(double number1, double number2){
        return number1 + number2;
    }
    public static void main(String[] args) {

        System.out.println("Tổng tiền gửi sau 12 tháng:" +tinhLai(10000000));
        System.out.println("Tổng 2 số:" +Cong2so(20,30));
    }
}
