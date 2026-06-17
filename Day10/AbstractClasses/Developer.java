package Day10.AbstractClasses;

public class Developer extends Employee {

    Developer(int Id, String name, double salary) {
        super(Id, name, salary);
    }

    @Override
    void calculateAnnualSalary() {
        int bonus = 100000;
        System.out.println((bonus + salary) + " LPA");
    }

}
