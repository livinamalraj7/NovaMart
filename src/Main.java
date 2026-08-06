import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = null;
        Customer customer = null;
        Cart cart = new Cart(1, 3, 450.75);
        Order order = new Order(1001, "06-08-2026", 450.75);

        int choice;

        do {

            System.out.println("\n========== NOVAMART ==========");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add Customer");
            System.out.println("4. View Customer");
            System.out.println("5. View Cart");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String productName = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();

                    product = new Product(productId, productName, price, stock);

                    System.out.println("\nProduct Added Successfully!");
                    break;

                case 2:

                    if (product != null) {
                        System.out.println("\n----- PRODUCT DETAILS -----");
                        product.displayProduct();
                    } else {
                        System.out.println("\nNo Product Available!");
                    }

                    break;

                case 3:

                    System.out.print("Enter Customer ID: ");
                    int customerId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();

                    customer = new Customer(customerId, customerName, phoneNumber);

                    System.out.println("\nCustomer Added Successfully!");
                    break;

                case 4:

                    if (customer != null) {
                        System.out.println("\n----- CUSTOMER DETAILS -----");
                        customer.displayCustomer();
                    } else {
                        System.out.println("\nNo Customer Available!");
                    }

                    break;

                case 5:

                    System.out.println("\n----- CART DETAILS -----");
                    cart.displayCart();

                    break;

                case 6:

                    System.out.println("\n----- ORDER DETAILS -----");
                    order.displayOrder();

                    break;

                case 7:

                    System.out.println("\nThank You For Using NovaMart!");
                    break;

                default:

                    System.out.println("\nInvalid Choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}