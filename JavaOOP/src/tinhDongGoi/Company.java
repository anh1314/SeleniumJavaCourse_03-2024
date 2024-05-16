package tinhDongGoi;

public class Company extends Student{

    // gọi thông qua kế thừa
    public  void showInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getPhone());
    }

    public static void main(String[] args) {
        Student student = new Student("Anh", 24, "0993802121", "Hà Nội");

        // hàm Set giá trị mới nếu cần thay đổi
        student.setAddress("Đồng Tháp"); // set thay đổi địa chỉ

        // in giá trị của student
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
        System.out.println( student.getPhone());

        // show giá trị của company
        Company company = new Company();
        company.showInfo();
    }
}
