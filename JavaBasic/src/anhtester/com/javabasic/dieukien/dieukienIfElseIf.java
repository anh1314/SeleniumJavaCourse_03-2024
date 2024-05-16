package anhtester.com.javabasic.dieukien;

public class dieukienIfElseIf {
    public static void main(String[] args) {

    // điều kiện If else if
        int diemTB = 7;

        if( diemTB >= 8){
            System.out.println("Học sinh giỏi");
        }
        else if(diemTB >= 7 && diemTB < 8){
            System.out.println("Học sinh Khá");
        }
        else if (diemTB >=5 && diemTB < 7) {
            System.out.println("Học sinh trung bình");
            
        }
        else{
            System.out.println("Học sinh yếu");
        }
    }
}
