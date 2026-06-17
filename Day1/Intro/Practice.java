package Day1.Intro;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // int radius = 0;

        // Scanner sc = new Scanner(System.in);

        // radius = sc.nextInt();

        // System.out.println("Areaof circle is " + 3.14 * radius * radius);

        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = "";
        name = sc.nextLine();
        System.out.println("And enter you marks for 3 subjects");

        int sub1 = 0;
        int sub2 = 0;
        int sub3 = 0;

        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();

        Double YourPer = (sub1 + sub2 + sub3) / 1.5;

        System.out.println("Your Percentage is " + YourPer);

    }
}
