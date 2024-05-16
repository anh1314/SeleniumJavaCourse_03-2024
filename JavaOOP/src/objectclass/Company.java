package objectclass;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getName());

        // Đối tượng Anonymous - vô danh, không có tên đối tượng
        new Employee().getAddress();
    }
}
