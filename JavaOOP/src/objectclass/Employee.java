package objectclass;

public class Employee {

    // Thành phần của lớp
    String name = "Anh";
    String birthdate;
    int age = 24;
    String address = "Bình Thuận";

    // Khối lệnh dạng block, chạy đầu tiên trong class này và tự động chạy nếu truy xuất sang class khác
    static {
        System.out.println("load config");
    }

    public String getName(){
        return name;
    }
    public  String getAddress(){
        return  address;
    }
    public static void main(String[] args) {

        // Khai báo class và object
        Employee employee1 = new Employee();
        System.out.println(employee1.getName());

        Employee employee2 = new Employee();
        System.out.println(employee2.getAddress());
    }
}
