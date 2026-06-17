package Day2;

public class Count {
    public static void main(String[] args) {
        int input = 45217890;
        int count = 0;

        while (input != 0) {
            count++;
            input = input / 10;
        }

        System.out.println("Total no of digit were : " + count);
    }
}
