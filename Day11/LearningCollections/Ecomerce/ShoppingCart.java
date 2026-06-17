package Day11.LearningCollections.Ecomerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    List<Product> cart = new ArrayList<>();

    public void AddProduct(Product pr) {
        cart.add(pr);

        System.out.println("Item added successfully!!!!");
    }

    public int removeProduct(int removeItemID) {
        for (Product pt : cart) {
            if (pt.getProductID() == removeItemID) {
                cart.remove(pt);
                return removeItemID;
            }

        }
        return -1;
    }

    public void UpdateProductName(int UpdateId, String newName) {
        for (Product pt : cart) {
            if (pt.getProductID() == UpdateId) {
                pt.setProductName(newName);
            }
        }
    }

    public Product searchProduct(int searchId) {

        for (Product pt : cart) {
            if (pt.getProductID() == searchId) {
                return pt;
            }
        }
        return null;
    }

    public List<Product> SortmyProducts() {

        Collections.sort(cart);

        return cart;

    }

    public void showProductDetails() {
        for (Product pt : cart) {
            System.out.println("Product [productID=" + pt.getProductID() + ", productName=" + pt.getProductName()
                    + ", price=" + pt.getPrice() + ", category="
                    + pt.getCategory() + "]");
        }
    }

}
