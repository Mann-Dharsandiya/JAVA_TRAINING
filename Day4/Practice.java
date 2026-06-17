package Day4;

import java.util.Scanner;

public class Practice {

    static double discount(double bill) {
        if (bill > 1000 && bill < 2000) {
            bill = bill - bill * 0.10;
            return bill;
        } else if (bill >= 2000 && bill < 5000) {
            bill = bill - bill * 0.20;
            return bill;
        } else if (bill >= 5000) {
            bill = bill - bill * 0.25;
        }
        return bill;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your bill amt");
        double bill = sc.nextDouble();

        double finalBill = discount(bill);

        System.out.println("Your Discounted bill is : " + finalBill);

    }
}
