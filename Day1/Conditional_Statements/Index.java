package Day1.Conditional_Statements;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        int balance = 500;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amt to withdraw");

        int amt = sc.nextInt();

        if (balance > amt) {
            System.out.println(amt + " Amt debited - avl balance is " + (balance - amt));
        } else {
            System.out.println("Chal bee gareeeb!!!");
        }

    }
}
