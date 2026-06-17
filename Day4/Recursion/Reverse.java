package Day4.Recursion;

public record Reverse() {

    static int reverse(int n, int rev) {

        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        return reverse(n / 10, rev * 10 + rem);
    }

    public static void main(String[] args) {
        System.out.println(reverse(4512, 0));
    }
}
