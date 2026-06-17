package Day5;

public class Sorted {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 1, 12, 15 };
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag++;
                System.out.println("Its not sorted");
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Its sorted!!!!");
        }
    }
}
