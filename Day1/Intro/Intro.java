package Day1.Intro;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Please enter you name!");

        Scanner input = new Scanner(System.in);

        String name = "";
        name = input.next();

        System.out.println("Your name is " + name);

        System.out.println("Enter your age ");
        int age = 0;
        age = input.nextInt();

        System.out.println("Your age is " + age);

    }
}
