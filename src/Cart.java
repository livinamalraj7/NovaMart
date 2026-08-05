public class Cart {

    int cartId;
    int totalItems;
    double totalAmount;

    Cart(int cartId, int totalItems, double totalAmount) {
        this.cartId = cartId;
        this.totalItems = totalItems;
        this.totalAmount = totalAmount;
    }

    void displayCart() {
    System.out.println("Cart ID: " + cartId);
    System.out.println("Total Items: " + totalItems);
    System.out.println("Total Amount: " + totalAmount);
    }
}