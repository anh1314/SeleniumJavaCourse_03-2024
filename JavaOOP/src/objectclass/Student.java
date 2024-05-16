package objectclass;

public class Student {
    String name;
    static  int age; //biến static mang giá trị suốt quá trình chạy code, chỉ mất khi chương trình dừng
    String phone = "093200283";

    // Khai báo hàm xây dựng CÓ tham số: dùng từ khoá "this." để phân biệt thành phần trong và ngoài class khi trùng tên
    public Student (String name, int age){
        this.name = name;  // dùng this phân biệt biến trong class và tham số trùng tên
        this.age = age;
    }

    // Khai báo hàm xây dựng KHÔNG tham số
    public  Student(){

    }
    public void getInfo(){
        System.out.println("Tên: " +name);
        System.out.println("Tuổi: " +age);
        System.out.println("SĐT: " +phone);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Hoa", 24);
        student1.getInfo();
        Student student2 = new Student();
        student2.getInfo();

    }
}
