package Day2;

public class Sum {
    public static void main(String[] args) {
        int num = 56129;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of digits : " + sum);
    }
}
