public class BankAccount {
    // create instances of class
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    // make parameterized constructor to initialize the variable
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // make double type get balance method
    public double getBalance() {
        return balance;
    }

    // this method is update the amount status
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // in this method we have to check whether withdraw amount is valid as account balance
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }
}

// create the subclass of super class to use extend keyword
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100); // Using getBalance() to access balance
        deposit(interest); 
    }

    // this method display results
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder name : " + accountHolder);
        System.out.println("total Balance: " + getBalance()); // Using getBalance() to access balance
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        // make the object of SavingsAccount and call
        SavingsAccount savingsAccount = new SavingsAccount(772587138525L, "Deepraj", 99999999999999.99, 33.35);
        savingsAccount.displayAccountDetails();

        savingsAccount.deposit(2557500.35);
        System.out.println("After deposit: " + savingsAccount.getBalance());

        savingsAccount.withdraw(786458086497.99);
        System.out.println("After withdrawal: " + savingsAccount.getBalance());

        savingsAccount.calculateInterest();
        System.out.println("After interest calculation: " + savingsAccount.getBalance());
    }
}
