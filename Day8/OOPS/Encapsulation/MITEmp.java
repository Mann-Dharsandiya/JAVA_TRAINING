package Day8.OOPS.Encapsulation;

import javax.print.DocFlavor.STRING;

public class MITEmp {
    public String name;
    public int EmpId;
    private double salary;

    MITEmp(String name, int EmpId, double salary) {
        this.name = name;
        this.EmpId = EmpId;
        this.salary = salary;
    }

    void showSalary() {
        System.out.println("Salary is " + salary);
    }

    void setSalary(int amt) {
        salary = amt;
    }

}
