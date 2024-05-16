package tinhkethua;

// class con
public class Student extends Person {
    public Student( int age, float heigh, String name) { // hàm xây dựng ko cần giống class cha
        super(name, age, heigh); // kế thừa, cấu trúc bắt buộc giống class cha
    }

    public static void main(String[] args) {
        Student student = new Student(30, 160, "Thi" );
        student.getInfo();
    }
}
