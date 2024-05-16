package phamvitruycap.common;

public class baseTest {
    String browser = "Chrome";  // default
    protected  String getBrowser(){
        return browser;
    } // protected
    private String mode = "Headless"; //private
    public void showInfo(){
        System.out.println(browser);
        System.out.println(mode);
    } // public
}
