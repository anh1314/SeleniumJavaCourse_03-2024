package phamvitruycap.phamviDefault;

// Phạm vi truy cập Default chỉ được phép truy cập trong cùng package
public class Company {
    String name = "Kim Anh";
    void showInfo(){
        System.out.println("Tên: " +name);
    }
}
