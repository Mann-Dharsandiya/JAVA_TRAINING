package Day11.LearningCollections.Ecomerce;

public class Product implements Comparable<Product> {
    private int productID;
    private String productName;
    private double price;
    private String category;

    public Product(int productID, String productName, double price, String category) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", category="
                + category + "]";
    }

    @Override
    public int compareTo(Product o) {
        return this.productName.compareTo(o.productName);
    }

}
