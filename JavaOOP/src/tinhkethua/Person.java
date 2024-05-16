package tinhkethua;

// inheritor: kế thừa
// class cha
public class Person {
    public String name;
    public int age;
    public float heigh;

    public Person(String name, int age, float heigh){
        this.name = name;
        this.age = age;
        this.heigh = heigh;
    }
    public void getInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Heigh: " +heigh);
    }
}
