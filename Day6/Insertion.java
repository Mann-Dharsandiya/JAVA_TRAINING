package Day6;

public class Insertion {

    static void Isort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 5, 4, 6 };

        for (int item : arr) {
            System.out.print(" " + item + " ");
        }
        System.out.println();

        Isort(arr);

        System.out.println();
        for (int item : arr) {
            System.out.print(" " + item + " ");
        }
    }
}
