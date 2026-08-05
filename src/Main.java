public class Main {
    public static void main(String[] args) {

        Product p = new Product(101, "Rice", 120.50, 25);
        Customer c = new Customer(1, "Livin", "9876543210");
        Cart cart = new Cart(1, 3, 450.75);
        Order o = new Order(1001, "05-08-2026", 450.75);

        p.displayProduct();
        System.out.println();

        c.displayCustomer();
        System.out.println();

        cart.displayCart();
        System.out.println();

        o.displayOrder();
    }
}