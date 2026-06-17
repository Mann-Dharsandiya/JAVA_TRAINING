package Day5;

public class Unique {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 3, 3, 4 };
        int j = 0; // point karta hai uniue array ke last tak

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.println(arr[i]);
        }

    }
}
