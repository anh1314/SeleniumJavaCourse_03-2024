package anhtester.com.javabasic.dieukien;

public class dieukienSwitchCase {
    public static void main(String[] args) {

        //Điều kiện Switch Case
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        String OS = "win";
        switch (OS){
            case "win":
                System.out.println("run test on windows");
                break;
            case "mac":
                System.out.println("run test on MacOS");
                break;
            default:
                System.out.println("run test on other platform");
                break;

        }
    }
}
