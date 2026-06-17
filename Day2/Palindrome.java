package Day2;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (temp == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        // System.out.println("Your Reversed no is " + reverse);

    }
}
