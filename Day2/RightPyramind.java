package Day2;

public class RightPyramind {
    public static void main(String[] args) {
        int line = 4;

        for (int row = 1; row <= line; row++) {
            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int row = line - 1; row >= 1; row--) {
            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
