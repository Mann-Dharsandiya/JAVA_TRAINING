package Day11;

public class BurgerKing implements RestrauntService {

    String FoodItem;

    BurgerKing(String FoodItem) {
        this.FoodItem = FoodItem;
    }

    @Override
    public void acceptOrder(String CustomerName) {
        System.out.println("Hello " + CustomerName + " your order is accepted!!");
    }

    @Override
    public void PrepareFood() {
        System.out.println("Preparing your burger with double tikki and cheese");
        System.out.println("Free choco lava cakes");
    }

    @Override
    public void DeliverFood() {
        System.out.println("We will deliver your food by bike in 45 mins");
    }

}
