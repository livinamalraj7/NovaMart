public class Customer {

    int customerId;
    String customerName;
    String phoneNumber;

    // Constructor
    Customer(int customerId, String customerName, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    // Display customer details
    void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // Getter for Customer ID
    int getCustomerId() {
        return customerId;
    }

    // Getter for Phone Number
    String getPhoneNumber() {
        return phoneNumber;
    }
}