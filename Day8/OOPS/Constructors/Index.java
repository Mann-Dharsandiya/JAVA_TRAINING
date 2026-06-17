package Day8.OOPS.Constructors;

public class Index {
    public static void main(String[] args) {
        Product Electronic1 = new Product("Mobile", 30000);

        Product Electronic2 = new Product(Electronic1);

        System.out.println(Electronic1.name);
        System.out.println(Electronic2.name);

    }
}
