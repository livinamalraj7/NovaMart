public class Order {

    int orderId;
    String orderDate;
    double totalAmount;

    Order(int orderId, String orderDate, double totalAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    void displayOrder() {
    System.out.println("Order ID: " + orderId);
    System.out.println("Order Date: " + orderDate);
    System.out.println("Total Amount: " + totalAmount);
    }
}