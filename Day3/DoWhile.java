package Day3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char customer;

        do {
            System.out.println("Welcome to my shop");
            System.out.println("Kya koi dukan mai ayya");
            customer = sc.nextLine().charAt(0);
        } while (customer == 'Y');

    }
}
