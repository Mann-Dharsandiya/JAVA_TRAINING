package Day10;

public class FoodOrder {
    void Order() {
        System.out.println("No Item selected");
    }

    void Order(String name) {
        System.out.println("Ordered Item : " + name);
    }

    void Order(String name, int qty) {
        int price = 20;

        int total = qty * price;

        System.out.println("Item " + name + " Quantity " + qty + " Total " + total);

    }

    void Order(String item, int Quantity, double discount) {
        int price = 20;

        double total = Quantity * price;

        total = total - (total * discount / 100);

        System.out.println("Item " + item + " Quantity " + Quantity + " Total with dis " + total);

    }

    void Order(String items[], int Quantity[]) {
        int grandTotal = 0;

        int price = 200;

        for (int i = 0; i < items.length; i++) {
            int bill = Quantity[i] * price;
            grandTotal += bill;

            System.out.println(items[i] + " -> " + bill);
        }

        System.out.println("Grand Total of you cart is " + grandTotal);

    }

}
