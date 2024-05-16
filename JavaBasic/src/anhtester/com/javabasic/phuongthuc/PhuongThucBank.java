package anhtester.com.javabasic.phuongthuc;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.getBankInfo();
        double Tongtien = ((Bank.getInterestRate()*10000000)/100);
        System.out.println("tong tien lai: " +Tongtien);
    }
}
