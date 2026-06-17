package Day3;

import java.util.Scanner;

public class ModularApp {

    static int Deposit(int balance, int amt) {
        balance += amt;
        System.out.println("hehehe ho gyepaise deposit!!!");
        return balance;
    }

    static int Withdraw(int balance, int amt) {
        if (balance > amt) {
            balance -= amt;
        }
        System.out.println("hehehe nikal gyepaise !!!");

        return balance;
    }

    static void showbalance(int balance) {

        System.out.println(balance);
    }

    static void FD(int balance, int time) {
        System.out.println("Your amt after " + time + " years will be " + (balance * 7 * time) / 100);

    }

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
                    balance = Withdraw(balance, amt);

                    break;

                case 2:
                    System.out.println("Enter the amt to deposit");
                    int amtToDeposit = obj.nextInt();

                    balance = Deposit(balance, amtToDeposit);

                    break;
                case 3:
                    showbalance(balance);
                    break;
                case 4:
                    System.out.println("Enter the time to deposit your money");
                    int time = obj.nextInt();
                    FD(balance, time);

                    break;
            }
        }
    }
}
