package Day6;

public class MoveZero {

    static void ZeroToEnd(int arr[]) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 3, 0, 4, 0 };

        ZeroToEnd(arr);

        for (int item : arr) {
            System.out.print(" " + item + " ");
        }
    }
}
