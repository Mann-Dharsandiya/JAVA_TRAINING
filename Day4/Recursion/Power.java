package Day4.Recursion;

public class Power {

    static int expo(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * expo(base, power - 1);
    }

    public static void main(String[] args) {

    }
}
