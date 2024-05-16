package anhtester.com.javabasic.collection;
import java.util.*;

public class Khaibao_Sudung {
    public static void main(String[] args) {

        // ArrayList
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playwright");

        for ( int i = 0; i < arrayList.size(); i++ ){
            System.out.println(arrayList.get(i));
        }

        // Set_HashSet: tự động xóa giá trị bị trùng
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("Cypress");
        stringSet.add("akaAT studio");
        stringSet.add("Cypress");

        for ( String str : stringSet){
            System.out.println(str);
        }

        // Map_HashMap
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("company", "FPT Software");
        stringMap.put("address", "Ha Noi");

        System.out.println(stringMap.get("company"));
    }

}

