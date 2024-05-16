package anhtester.com.javabasic.mang;

public class mangMotChieu {
    public static void main(String[] args) {

        //khai báo mảng
        int songuyen[] = new int[20];

        //thêm giá trị vào mảng
        // giá trị trong mảng bắt đầu từ 0, mảng có 20 giá trị nghĩa là có vị trí từ 0-19
        songuyen[0] = 5;
        songuyen[2] = 10;
        songuyen[4] = 15;
        songuyen[19] = 8;

        // in giá trị trong mảng theo thủ công từng vị trí
        System.out.println(songuyen[0]);
        System.out.println(songuyen[1]); //nếu ko khai báo giá trị mảng thì mặc định là 0
        System.out.println(songuyen[2]);
        System.out.println(songuyen[4]);
        System.out.println(songuyen[19]);

        System.out.println("độ dài mảng: " +songuyen.length);

        // Duyệt phần tử trong mảng với vòng lặp For
        // Dừng lại với giá trị bé hơn độ dài của mảng // i<=songuyen.length ->false
        for ( int i=2; i<songuyen.length; i++){
            System.out.println(songuyen[i]);
        }

        // Thêm giá trị vào mảng thông qua vòng lặp For
        for ( int i=0; i<songuyen.length; i++){
            songuyen[i] = 10;
        }
        for ( int i=0; i<songuyen.length; i++) {  // i<=songuyen.length ->false
            System.out.println(songuyen[i]);
        }
    }
}
