package anhtester.com.javabasic.mang;

public class mangSochan3 {
    public static void main(String[] args) {

        //mảng 1 để tạo số từ 1-50
        int mang1[] = new int [50];
        int mang2[] = new int [50];

        for ( int i=0; i<mang1.length; i++) {
            mang1[i] = i + 1;
        }
        for ( int i=0; i<mang1.length; i++) {
            System.out.println(mang1[i]);

            //mảng 2 để lưu những giá trị số chẵn
            if (mang1[i] % 2 == 0) {
                mang2[ i ] = mang1[ i ];
            }
        }
            for (int i=0; i<mang2.length; i++){
            System.out.println("mang 2: " +mang2[i]);
        }
    }
}
