package Day5;

public class BubbleSort {

    static void Bsort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag == 0) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 1, 3, 8, 2 };

        for (int item : arr) {
            System.out.print(" " + item + " ");
        }
        System.out.println();

        Bsort(arr);

        System.out.println("After sorting");
        for (int item : arr) {
            System.out.print(" " + item + " ");
        }

    }
}
