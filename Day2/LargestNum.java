package Day2;

public class LargestNum {
    public static void main(String[] args) {
        int num = 7521;
        int max = 0;

        while (num != 0) {
            int rem = num % 10;
            if (max < rem) {
                max = rem;
            }
            num = num / 10;
        }

        System.out.println("Max digit in this no is " + max);

    }
}
