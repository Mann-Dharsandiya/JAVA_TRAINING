package Day1.Conditional_Statements;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char symbol = sc.next().charAt(0);

        if (symbol == 'f') {
            System.out.println("Take input in c");
        } else if (symbol == 'c') {
            System.out.println("Take input in f");
        } else {

        }
    }
}
