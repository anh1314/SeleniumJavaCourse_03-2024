package phamvitruycap;

// Phạm vi truy cập private: chỉ được phép truy cập trong cùng class
public class Person {
    private int data = 40;
    private void msg(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.data);
    }
}
