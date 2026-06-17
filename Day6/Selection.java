package Day6;

import java.net.Socket;

public class Selection {

    static void Ssort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 9, 1, 6 };

        for (int item : arr) {
            System.out.print(" " + item + " ");
        }
        System.out.println();

        Ssort(arr);

        System.out.println();
        for (int item : arr) {
            System.out.print(" " + item + " ");
        }

    }
}
