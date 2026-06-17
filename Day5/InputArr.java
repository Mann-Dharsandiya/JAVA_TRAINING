package Day5;

import java.util.Scanner;

public class InputArr {
    public static void main(String[] args) {
        int arr[] = new int[5];

        // System.out.println(arr[0]);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your arr element");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your elements are::");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " is " + arr[i]);

        }

    }
}
