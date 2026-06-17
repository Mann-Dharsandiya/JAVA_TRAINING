package Day8;

public class AvgSlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int k = 2;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int avg = sum / 2;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            int currentAvg = sum / 2;
            if (avg < currentAvg) {
                avg = currentAvg;
            }
        }

        System.out.println("Your highest avg in a window is " + avg);

    }
}
