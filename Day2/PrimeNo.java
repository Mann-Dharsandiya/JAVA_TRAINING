package Day2;

public class PrimeNo {
    public static void main(String[] args) {
        int num = 11;
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag++;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Its a prime");
        } else {
            System.out.println("not prime");
        }
    }
}
