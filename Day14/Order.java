package Day14;

public class Order {
    private int orderId;
    private int customerId;
    private String productName;
    private double amount;

    public Order(int orderId, int customerId, String productName, double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productName = productName;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customerId=" + customerId + ", productName=" + productName + ", amount="
                + amount + "]";
    }

}
