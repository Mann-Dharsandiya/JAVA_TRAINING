package Day5;

public class Demo {
    public static void main(String[] args) {

        // int arr[] = { 2, 6, 1, 4, 9 };

        int arr2[] = new int[5];

        arr2[0] = 3;
        arr2[1] = 1;
        arr2[2] = 7;
        arr2[3] = 2;
        arr2[4] = 8;

        System.out.println(arr2.length);

        // System.out.println(arr2[4]);

        // arr lenght -> 5 index -> lenght -1

        // for (int i = 0; i < arr2.length; i++) {
        // System.out.println(arr2[i]);
        // }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
            }
        }

    }
}
