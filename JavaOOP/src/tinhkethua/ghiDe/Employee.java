package tinhkethua.ghiDe;
//class con
public class Employee extends Company {
    public Employee(String companyName, String adress, int employeeTotal) {
        super(companyName, adress, employeeTotal);
    }

    // nếu hàm class CON giống class CHA thì sẽ ưu tiên dùng hàm class CON
    // dùng từ khoá super nếu muốn gọi từ class cha (xảy ra trùng tên hàm)
    @Override
    public void showInfo() { //ghi đè class cha
        System.out.println("class con Employee");
        super.showInfo(); // gọi từ class cha Company
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Viettel", "Hanoi", 200000);
        employee.showInfo(); // của class cha Company
    }
}
