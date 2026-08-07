public class Product {

    int productId;
    String productName;
    double price;
    int stock;

    // Constructor
    Product(int productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // Display product details
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    // Getter for Product ID
    int getProductId() {
        return productId;
    }

    // Update product details
    void updateProduct(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }
}