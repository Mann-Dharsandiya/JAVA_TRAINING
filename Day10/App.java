package Day10;

public class App {
    public static void main(String[] args) {
        FoodOrder cust1 = new FoodOrder();

        String items[] = { "Chips", "icecream", "Fries" };

        int quantity[] = { 2, 4, 1 };

        cust1.Order(items, quantity);

    }
}
