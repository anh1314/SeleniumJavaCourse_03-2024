package tinhDaHinh;

public class demoNapChong {

    public  int tinhTong(int number1, int number2){
        return number1+ number2;
    }
    public  int tinhTong(int number1, int number2, int number3){
        return number1+ number2 + number3;
    }
    public  double tinhTong(int number1, int number2, double number3){
        return number1+ number2 + number3;
    }
    public static void main(String[] args) {
        demoNapChong demoNapChong = new demoNapChong();
        System.out.println(demoNapChong.tinhTong(20, 30));
        System.out.println(demoNapChong.tinhTong(20, 30, 40));
    }
}
