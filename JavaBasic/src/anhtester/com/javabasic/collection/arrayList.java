package anhtester.com.javabasic.collection;

import java.util.ArrayList;
import java.util.Objects;

public class arrayList {

    public static void main(String[] args) {
        //Khai báo ArrayList
        ArrayList<String> arrayList1 = new ArrayList<String>();

        // Thêm phần tử vào ArrayList
        arrayList1.add("Senelium");
        arrayList1.add("em");
        arrayList1.add("Senelium2");
        arrayList1.add(2, "Extent Report"); // Thêm vào vị trí chỉ định

        //Remove phần tử trong ArrayList
        arrayList1.remove("em"); // Remove theo Tên
        arrayList1.remove(1); // Remove theo vị trí 2

        // Duyệt ArrayList dùng vòng lặp For cơ bản
        for ( int i = 0; i < arrayList1.size(); i++ ){
            System.out.println(arrayList1.get(i));
        }
        System.out.println("================");
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Playwright");
        arrayList2.add("Cypress");

        // add All ArrayList2  vào ArrayList1
        arrayList1.addAll(arrayList2);
        for ( int i = 0; i < arrayList1.size(); i++ ){
            System.out.println(arrayList1.get(i));
        }

        // Tìm kiếm phần tử trong ArrayList, trả về kết quả True-False
        System.out.println("Tìm kiếm phần tử: " +arrayList1.contains("abc"));

        // Chuyển ArrayList về dạng Array
       Object[] array = arrayList1.toArray();
       for ( int i = 0; i < array.length; i ++){
           System.out.println("ArrayList to Array" +array[i]);
       }
    }
}
