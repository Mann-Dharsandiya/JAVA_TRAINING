package Day5;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int arr[] = new int[5];

        // input -> 5 subjects -> avg -> sum of all elements/no of elements

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your arr element");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Average of student is " + (sum / arr.length));

    }
}
