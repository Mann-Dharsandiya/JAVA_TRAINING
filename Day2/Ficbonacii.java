package Day2;

public class Ficbonacii {
    public static void main(String[] args) {
        int length = 7;

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 1; i <= length; i++) {
            int c = a + b;
            System.out.print(" " + c + " ");
            a = b;
            b = c;
        }
    }
}
