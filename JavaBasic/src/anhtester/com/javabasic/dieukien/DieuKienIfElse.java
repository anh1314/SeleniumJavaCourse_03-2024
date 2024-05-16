package anhtester.com.javabasic.dieukien;

public class DieuKienIfElse {

    public static void main(String[] args) {
        // Điều kiện If
        int age = 30;
        String name = "auto";
        String message = " add category successful";

        if(age > 20 && (name.equals("manual") || message.contains("success"))) {
            System.out.println("Thoa dieu kien" );
        }
        // Điều kiện If Else
        int a = 13;
        if ( a % 2 == 0) {
            System.out.println("số " + a +  " là số chẵn");
        }
        else{
            System.out.println("số "  + a +  " là số lẻ");
        }

    }
}
