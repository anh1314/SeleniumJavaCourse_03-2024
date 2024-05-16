package phamvitruycap.phamviPublic;

// Phạm vi truy cập Public: được phép truy cập ở mọi nơi
public class demoPublic {
    public  String name = "Selenium";
    public int version = 4;

    public String getName(){
        return name;
    }
    public void showInfo(){
        System.out.println("Library: " +name);
        System.out.println("Version: " +version);
    }

    public static void main(String[] args) {
        demoPublic demoPublic = new demoPublic();
        demoPublic.showInfo();

    }
}
