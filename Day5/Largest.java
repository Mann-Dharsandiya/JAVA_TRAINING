package Day5;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        int arr[] = new int[8];

        // input -> 7-8 -> largest -> return

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your arr element");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("max element is " + max);

    }
}
