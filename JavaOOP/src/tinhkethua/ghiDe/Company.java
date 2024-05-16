package tinhkethua.ghiDe;

public class Company {
    private String companyName;
    private String Adress;
    private  int employeeTotal;

    public Company(String companyName, String adress, int employeeTotal) {
        this.companyName = companyName;
        Adress = adress;
        this.employeeTotal = employeeTotal;
    }
    public void showInfo(){
        System.out.println(companyName);
        System.out.println(Adress);
        System.out.println(employeeTotal);
    }
}
