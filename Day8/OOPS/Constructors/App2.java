package Day8.OOPS.Constructors;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SBI cust1 = new SBI("Pankaj", "SBIN00210COR", 200000);

        int input = 0;

        while (input != 6) {
            System.out.println("1.Deposit  2.Withdraw  3.showBalance 4.CheckAccount 5.showAccountDetails 6.exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    int amt = sc.nextInt();
                    cust1.Deposit(amt);
                    break;
                case 2:
                    int amt2 = sc.nextInt();
                    cust1.Withdraw(amt2);
                    break;
                case 3:
                    cust1.CurrentBalace();

                    break;
                case 4:
                    cust1.CheckAccount();
                    break;
                case 5:
                    cust1.showDetails();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;

            }

        }

        // cust1.ManagerName="Kanchan";

    }
}
