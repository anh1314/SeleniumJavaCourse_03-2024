package anhtester.com.javabasic.variables;

public class StaticVariables {
    int tuoi = 20; //biến toàn cục
    static int age = 30; //biến static

    public static void main(String[] args) {
        StaticVariables staticvariables = new StaticVariables();
        System.out.println("tuoi :" + staticvariables.tuoi);
        System.out.println("tuoi :" +age);
    }
}
