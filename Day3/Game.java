package Day3;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int player1 = 30;
        int player2 = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        do {
            count++;
            System.out.println("Guess the number");
            player2 = sc.nextInt();

            if (player2 > player1) {
                System.out.println("please guess a smaller no");
            } else if (player2 < player1) {
                System.out.println("please guess a bigger no");
            } else {
                System.out.println("Hadippaaa number guessed");
            }
        } while (player1 != player2);

        System.out.println(count + " is the no of guess you have taken");
    }
}
