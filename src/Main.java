import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        Cart cart = new Cart(1, 3, 450.75);
        Order order = new Order(1001, "06-08-2026", 450.75);

        int choice = 0;

        do {

            System.out.println("\n=================================");
            System.out.println("             NOVAMART");
            System.out.println("=================================");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add Customer");
            System.out.println("4. View Customers");
            System.out.println("5. View Cart");
            System.out.println("6. View Orders");
            System.out.println("7. Search Product");
            System.out.println("8. Update Product");
            System.out.println("9. Delete Product");
            System.out.println("10. Exit");
            System.out.println("=================================");

            // MENU VALIDATION
            while (true) {

                try {

                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    if (choice >= 1 && choice <= 10) {
                        break;
                    }

                    System.out.println(
                        "Invalid choice! Please select 1-10."
                    );

                } catch (InputMismatchException e) {

                    System.out.println(
                        "Invalid input! Please enter a number."
                    );

                    sc.next();
                }
            }

            switch (choice) {

                // =========================================
                // TASK 1 - ADD PRODUCT
                // =========================================

                case 1:

                    int productId;

                    while (true) {

                        try {

                            System.out.print("Enter Product ID: ");
                            productId = sc.nextInt();

                            if (productId <= 0) {

                                System.out.println(
                                    "Product ID must be greater than 0."
                                );

                                continue;
                            }

                            boolean duplicate = false;

                            for (Product p : products) {

                                if (p.getProductId() == productId) {
                                    duplicate = true;
                                    break;
                                }
                            }

                            if (duplicate) {

                                System.out.println(
                                    "Product ID already exists!"
                                );

                            } else {

                                break;
                            }

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Product ID must be a number."
                            );

                            sc.next();
                        }
                    }

                    sc.nextLine();

                    String productName;

                    while (true) {

                        System.out.print("Enter Product Name: ");
                        productName = sc.nextLine().trim();

                        if (productName.matches("[A-Za-z ]{3,30}")) {
                            break;
                        }

                        System.out.println(
                            "Invalid Product Name!"
                        );
                    }

                    double price;

                    while (true) {

                        try {

                            System.out.print("Enter Price: ");
                            price = sc.nextDouble();

                            if (price > 0) {
                                break;
                            }

                            System.out.println(
                                "Price must be greater than 0."
                            );

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Enter a valid price."
                            );

                            sc.next();
                        }
                    }

                    int stock;

                    while (true) {

                        try {

                            System.out.print("Enter Stock: ");
                            stock = sc.nextInt();

                            if (stock >= 0) {
                                break;
                            }

                            System.out.println(
                                "Stock cannot be negative."
                            );

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Stock must be a number."
                            );

                            sc.next();
                        }
                    }

                    products.add(
                        new Product(
                            productId,
                            productName,
                            price,
                            stock
                        )
                    );

                    System.out.println(
                        "Product Added Successfully!"
                    );

                    break;


                // =========================================
                // TASK 2 - VIEW PRODUCTS
                // =========================================

                case 2:

                    if (products.isEmpty()) {

                        System.out.println(
                            "No Products Available!"
                        );

                    } else {

                        System.out.println(
                            "\n----- PRODUCT LIST -----"
                        );

                        for (Product p : products) {

                            p.displayProduct();

                            System.out.println(
                                "-------------------------"
                            );
                        }
                    }

                    break;


                // =========================================
                // TASK 3 - ADD CUSTOMER
                // =========================================

                case 3:

                    int customerId;

                    while (true) {

                        try {

                            System.out.print("Enter Customer ID: ");
                            customerId = sc.nextInt();

                            if (customerId <= 0) {

                                System.out.println(
                                    "Customer ID must be greater than 0."
                                );

                                continue;
                            }

                            boolean duplicate = false;

                            for (Customer c : customers) {

                                if (c.getCustomerId() == customerId) {
                                    duplicate = true;
                                    break;
                                }
                            }

                            if (duplicate) {

                                System.out.println(
                                    "Customer ID already exists!"
                                );

                            } else {

                                break;
                            }

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Customer ID must be a number."
                            );

                            sc.next();
                        }
                    }

                    sc.nextLine();

                    String customerName;

                    while (true) {

                        System.out.print("Enter Customer Name: ");
                        customerName = sc.nextLine().trim();

                        if (customerName.matches("[A-Za-z ]{3,30}")) {
                            break;
                        }

                        System.out.println(
                            "Invalid Customer Name!"
                        );
                    }

                    String phoneNumber;

                    while (true) {

                        System.out.print("Enter Phone Number: ");
                        phoneNumber = sc.nextLine().trim();

                        if (!phoneNumber.matches("\\d{10}")) {

                            System.out.println(
                                "Enter exactly 10 digits."
                            );

                            continue;
                        }

                        boolean phoneExists = false;

                        for (Customer c : customers) {

                            if (c.getPhoneNumber().equals(phoneNumber)) {
                                phoneExists = true;
                                break;
                            }
                        }

                        if (phoneExists) {

                            System.out.println(
                                "Phone Number already exists!"
                            );

                        } else {

                            break;
                        }
                    }

                    customers.add(
                        new Customer(
                            customerId,
                            customerName,
                            phoneNumber
                        )
                    );

                    System.out.println(
                        "Customer Added Successfully!"
                    );

                    break;


                // =========================================
                // TASK 4 - VIEW CUSTOMERS
                // =========================================

                case 4:

                    if (customers.isEmpty()) {

                        System.out.println(
                            "No Customers Available!"
                        );

                    } else {

                        System.out.println(
                            "\n----- CUSTOMER LIST -----"
                        );

                        for (Customer c : customers) {

                            c.displayCustomer();

                            System.out.println(
                                "-------------------------"
                            );
                        }
                    }

                    break;


                // =========================================
                // TASK 5 - VIEW CART
                // =========================================

                case 5:

                    System.out.println(
                        "\n----- CART DETAILS -----"
                    );

                    cart.displayCart();

                    break;


                // =========================================
                // TASK 5 - VIEW ORDERS
                // =========================================

                case 6:

                    System.out.println(
                        "\n----- ORDER DETAILS -----"
                    );

                    order.displayOrder();

                    break;


                // =========================================
                // TASK 5 - SEARCH PRODUCT
                // =========================================

                case 7:

                    int searchId;

                    while (true) {

                        try {

                            System.out.print(
                                "Enter Product ID to search: "
                            );

                            searchId = sc.nextInt();

                            if (searchId > 0) {
                                break;
                            }

                            System.out.println(
                                "Product ID must be greater than 0."
                            );

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Enter a valid number."
                            );

                            sc.next();
                        }
                    }

                    boolean found = false;

                    for (Product p : products) {

                        if (p.getProductId() == searchId) {

                            System.out.println(
                                "\n----- PRODUCT FOUND -----"
                            );

                            p.displayProduct();

                            found = true;

                            break;
                        }
                    }

                    if (!found) {

                        System.out.println(
                            "Product with ID "
                            + searchId
                            + " not found."
                        );
                    }

                    break;


                // =========================================
                // TASK 6 - UPDATE PRODUCT
                // =========================================

                case 8:

                    int updateId;

                    while (true) {

                        try {

                            System.out.print(
                                "Enter Product ID to update: "
                            );

                            updateId = sc.nextInt();

                            if (updateId > 0) {
                                break;
                            }

                            System.out.println(
                                "Product ID must be greater than 0."
                            );

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Enter a valid number."
                            );

                            sc.next();
                        }
                    }

                    Product productToUpdate = null;

                    for (Product p : products) {

                        if (p.getProductId() == updateId) {

                            productToUpdate = p;

                            break;
                        }
                    }

                    if (productToUpdate == null) {

                        System.out.println(
                            "Product with ID "
                            + updateId
                            + " not found."
                        );

                        break;
                    }

                    System.out.println(
                        "\n----- PRODUCT FOUND -----"
                    );

                    productToUpdate.displayProduct();

                    sc.nextLine();

                    String newName;

                    while (true) {

                        System.out.print(
                            "Enter New Product Name: "
                        );

                        newName = sc.nextLine().trim();

                        if (newName.matches("[A-Za-z ]{3,30}")) {
                            break;
                        }

                        System.out.println(
                            "Invalid Product Name!"
                        );
                    }

                    double newPrice;

                    while (true) {

                        try {

                            System.out.print(
                                "Enter New Price: "
                            );

                            newPrice = sc.nextDouble();

                            if (newPrice > 0) {
                                break;
                            }

                            System.out.println(
                                "Price must be greater than 0."
                            );

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Enter a valid price."
                            );

                            sc.next();
                        }
                    }

                    int newStock;

                    while (true) {

                        try {

                            System.out.print(
                                "Enter New Stock: "
                            );

                            newStock = sc.nextInt();

                            if (newStock >= 0) {
                                break;
                            }

                            System.out.println(
                                "Stock cannot be negative."
                            );

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Stock must be a number."
                            );

                            sc.next();
                        }
                    }

                    productToUpdate.updateProduct(
                        newName,
                        newPrice,
                        newStock
                    );

                    System.out.println(
                        "Product Updated Successfully!"
                    );

                    break;


                // =========================================
                // TASK 7 - DELETE PRODUCT
                // =========================================

                case 9:

                    int deleteId;

                    while (true) {

                        try {

                            System.out.print(
                                "Enter Product ID to delete: "
                            );

                            deleteId = sc.nextInt();

                            if (deleteId > 0) {
                                break;
                            }

                            System.out.println(
                                "Product ID must be greater than 0."
                            );

                        } catch (InputMismatchException e) {

                            System.out.println(
                                "Enter a valid number."
                            );

                            sc.next();
                        }
                    }

                    Product productToDelete = null;

                    for (Product p : products) {

                        if (p.getProductId() == deleteId) {

                            productToDelete = p;

                            break;
                        }
                    }

                    if (productToDelete == null) {

                        System.out.println(
                            "Product with ID "
                            + deleteId
                            + " not found."
                        );

                    } else {

                        products.remove(productToDelete);

                        System.out.println(
                            "Product Deleted Successfully!"
                        );
                    }

                    break;


                // =========================================
                // TASK 8 - EXIT
                // =========================================

                case 10:

                    System.out.println(
                        "\n================================="
                    );

                    System.out.println(
                        "     Thank You For Using NovaMart!"
                    );

                    System.out.println(
                        "================================="
                    );

                    break;
            }

        } while (choice != 10);

        sc.close();
    }
}