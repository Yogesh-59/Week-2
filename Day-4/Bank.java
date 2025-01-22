import java.util.ArrayList;

// Customer class
class Customer {
    private String name;
    private int accountNumber;
    private float balance;

    // Constructor for the customer class
    public Customer(String name, int accountNumber, float balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance);
    }

    // Method to add balance
    public void addBalance(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount added successfully. Updated balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to withdraw balance
    public void withdrawBalance(float amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Updated balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Bank class
public class Bank {
    private ArrayList<Customer> accounts = new ArrayList<>();

    // Constructor for the Bank class
    public Bank() {
        // Array list is already initialized in the declaration
    }

    public void addCustomer(Customer customer) {
        accounts.add(customer);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create customer objects with corrected account numbers
        Customer customer1 = new Customer("Amit", 354, 1000.0f);
        Customer customer2 = new Customer("Aryan", 208, 8900.0f);
        Customer customer3 = new Customer("Deepraj", 700, 37000.0f);

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        // Display initial balances
        System.out.println("Customer Balances:");
        for (Customer customer : bank.accounts) {
            customer.displayBalance();
        }

        // Deposit and withdraw operations
        customer1.addBalance(20000.0f);
        customer1.withdrawBalance(900.0f); // Valid withdrawal
        customer1.withdrawBalance(412421.0f); // Insufficient balance
    }
}