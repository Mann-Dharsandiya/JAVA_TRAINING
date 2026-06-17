package Day5;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {

        int arr[] = new int[8];

        // input -> 7-8 -> largest -> return

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your arr element");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("min element is " + min);

    }
}
