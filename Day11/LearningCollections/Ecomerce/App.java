package Day11.LearningCollections.Ecomerce;

public class App {
    public static void main(String[] args) {
        // ShoppingCart cartList = new ShoppingCart();

        // cartList.AddProduct(new Product(101, "Shirt", 1200, "Clothing"));

        // cartList.AddProduct(new Product(102, "Pant", 1500, "Clothing"));

        // cartList.AddProduct(new Product(103, "Laptop", 50000, "Electronics"));

        // cartList.AddProduct(new Product(105, "Milk", 30, "Food"));

        // cartList.AddProduct(new Product(109, "Waffers", 70, "Food"));

        // cartList.showProductDetails();

        // System.out.println("Search for a Product");

        // System.out.println(cartList.searchProduct(105));

        // System.out.println("Update a item name in my cart");

        // cartList.UpdateProductName(109, "Waffer chips");

        // cartList.showProductDetails();

        // System.out.println("Remove a item");

        // System.out.println(cartList.removeProduct(105));

        // cartList.showProductDetails();

        // System.out.println("=========Sorting===========");
        // cartList.SortmyProducts();

        // cartList.showProductDetails();

        // Review Panel Demo
        System.out.println("\n\n=========REVIEW PANEL DEMO===========\n");

        ReviewPanel reviewPanel = new ReviewPanel();

        // Create sample products
        Product product1 = new Product(101, "Shirt", 1200, "Clothing");
        Product product2 = new Product(103, "Laptop", 50000, "Electronics");
        Product product3 = new Product(105, "Milk", 30, "Food");

        // Add sample reviews
        reviewPanel.addReview(new Review(1, product1, "Great quality shirt, very comfortable"));
        reviewPanel.addReview(new Review(2, product2, "Excellent laptop, very fast"));
        reviewPanel.addReview(new Review(3, product1, "Good value for money"));
        reviewPanel.addReview(new Review(4, product3, "Fresh milk, good packaging"));
        reviewPanel.addReview(new Review(5, product2, "Outstanding performance"));

        System.out.println("Display All Reviews");
        reviewPanel.displayAllReviews();

        System.out.println("Search Reviews by Product Name: Shirt");
        for (Review review : reviewPanel.searchReviewByProductName("Shirt")) {
            System.out.println(review);
        }

        // System.out.println("Search Reviews by Product Name: Laptop");
        // for (Review review : reviewPanel.searchReviewByProductName("Laptop")) {
        // System.out.println(review);
        // }

        System.out.println("Update Comment for Review ID 2 ---");
        boolean updated = reviewPanel.updateCommentByReviewId(2,
                "Updated: Amazing laptop with excellent processing speed!");
        System.out.println("Update successful: " + updated);

        System.out.println(" Display Reviews After Update ");
        reviewPanel.displayAllReviews();

        System.out.println("Sort Reviews by Review ID ");
        reviewPanel.sortReviewListByReviewId();
        reviewPanel.displayAllReviews();

    }
}
