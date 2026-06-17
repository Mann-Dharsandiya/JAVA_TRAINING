package Day3;

public class Demo {
    static int Increment(int num) {// parameter ka scope -> local
        num++;
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {

        int data = 10;

        System.out.println(data);// pass by value -> copy

        int result = Increment(data);

        System.out.println(result);

    }
}
