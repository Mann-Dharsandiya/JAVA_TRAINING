package Day2;

public class HollowSquare {
    public static void main(String[] args) {
        int line = 5;

        // for (int row = 1; row <= line; row++) {
        // for (int col = 1; col <= line; col++) {
        // if (row == 1 || row == line || col == 1 || col == line) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        for (int row = 1; row <= line; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
