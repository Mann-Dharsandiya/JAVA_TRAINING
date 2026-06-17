package Day2;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        temp = num;
        double sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + Math.pow(digit, count);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("Its a armstrong");
        }

    }
}
