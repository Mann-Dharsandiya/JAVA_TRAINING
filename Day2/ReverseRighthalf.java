package Day2;

public class ReverseRighthalf {
    public static void main(String[] args) {
        int line = 4;

        for (int row = line; row >= 1; row--) {
            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
