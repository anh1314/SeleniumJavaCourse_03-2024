package anhtester.com.javabasic.vonglapFor;

public class vonglapFor {

    public static void main(String[] args) {

        // vòng lặp for đơn giản
        for ( int i=1; i<=10; i++){
            System.out.println("số thứ tự: " +i);
        }

        // print số chẵn
        for (int a=0; a<=30; a++){
            if ( a % 2 ==0){
                System.out.println("số chẵn: " +a);
            }
        }
    }
}
