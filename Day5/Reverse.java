package Day5;

public class Reverse {

    public static void main(String[] args) {
        // reverse an array using two pointer

        int arr[] = { 5, 1, 9, 2, 6, 8 };
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int item : arr) {
            System.out.println(item);
        }

    }
}
