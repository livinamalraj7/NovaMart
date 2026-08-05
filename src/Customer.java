public class Customer {

    int customerId;
    String customerName;
    String phoneNumber;

    Customer(int customerId, String customerName, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    void displayCustomer() {
    System.out.println("Customer ID: " + customerId);
    System.out.println("Customer Name: " + customerName);
    System.out.println("Phone Number: " + phoneNumber);
    }
}