package Day7;

public class SlidingWindow {
    public static void main(String[] args) {

        int arr[] = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int MaxWindowSum = 0;

        for (int i = 0; i < k; i++) {
            MaxWindowSum += arr[i];
        }

        int CurrentMax = MaxWindowSum;

        for (int i = k; i < arr.length; i++) {
            MaxWindowSum = MaxWindowSum - arr[i - k];
            MaxWindowSum = MaxWindowSum + arr[i];

            if (MaxWindowSum > CurrentMax) {
                CurrentMax = MaxWindowSum;
            }

        }

        System.out.println("Max sum of the sub array is " + CurrentMax);

    }
}
