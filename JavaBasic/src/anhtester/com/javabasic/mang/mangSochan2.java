package anhtester.com.javabasic.mang;

public class mangSochan2 {
    public static void main(String[] args) {
        int mang1[] = new int [50];
        int mang2[] = new int [50];

        for ( int i=0; i<mang1.length; i++) {
            mang1[i] = i + 1;
            if (mang1[i] % 2 == 0) {
                mang2[i] = mang1[i];
                System.out.print(" " +mang2[i] );
            }
        }
    }
}
