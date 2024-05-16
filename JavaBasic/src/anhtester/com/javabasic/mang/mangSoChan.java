package anhtester.com.javabasic.mang;

public class mangSoChan {
    public static void main(String[] args) {
        int[] mangSoChan = new int[26]; // Mảng sẽ có tối đa 26 số chẵn từ 0 đến 50

        int index = 0; // Biến để theo dõi vị trí lưu số chẵn vào mảng

        // Duyệt vòng lặp để tìm các số chẵn và lưu vào mảng
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                mangSoChan[index] = i;
                index++;
            }
        }

        // Duyệt mảng để in ra kết quả
        System.out.println("Các số chẵn từ 0 đến 50 là:");
        for (int soChan : mangSoChan) {
            if (soChan != 0) {
                System.out.print(soChan + " ");
            }
        }
    }
}
