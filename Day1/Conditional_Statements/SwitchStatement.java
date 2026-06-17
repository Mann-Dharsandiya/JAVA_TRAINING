package Day1.Conditional_Statements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.err.println("1.Withdrawl 2.Deposit 3.CurrentBalance 4. FD 5. exit");
        int balance = 2000;
        Scanner obj = new Scanner(System.in);

        int option = 0;

        while (option != 5) {
            System.out.println("Enter your operation!!");
            option = obj.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amt to withdraw");
                    int amt = obj.nextInt();

                    if (balance > amt) {
                        balance -= amt;
                        System.out.println(amt + " is debited from your acoount");
                    }
                    break;

                case 2:
                    System.out.println("Enter the amt to deposit");
                    int amtToDeposit = obj.nextInt();

                    balance += amtToDeposit;

                    break;
                case 3:
                    System.out.println(balance);
                    break;
                case 4:
                    System.out.println("Enter the time to deposit your money");
                    int time = obj.nextInt();

                    System.out.println("Your amt after " + time + " years will be " + (balance * 7 * time) / 100);
                    break;
            }
        }

    }
}
