package Day5;

public class BinarySearch {

    static int Bsearch(int arr[], int key) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 11, 15, 17, 20 };
        int key = 11;

        int index = Bsearch(arr, key);

        if (index == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element present at " + index);
        }

    }

}