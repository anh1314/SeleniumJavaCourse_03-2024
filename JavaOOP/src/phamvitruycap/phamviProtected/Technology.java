package phamvitruycap.phamviProtected;

import phamvitruycap.common.baseTest;

// Phạm vi truy cập Protected: có thể truy cập trong package, và ngoài package phải có Kế thừa
public class Technology extends baseTest {  //  Tính kế thừa
    public  void showInfo(){
        Computer computer = new Computer();
        System.out.println(computer.getComputerName());

        // gọi từ class baseTest trong package common
        System.out.println(getBrowser()); // kế thừa
    }
    public static void main(String[] args) {
        Technology technology = new Technology();
        technology.showInfo();
    }
}
