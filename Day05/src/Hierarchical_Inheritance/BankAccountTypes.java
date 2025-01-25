package Hierarchical_Inheritance;

 class  BankAccount{
    protected long accountNumber;
    protected double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Total Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        displayAccountDetails();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        displayAccountDetails();
        System.out.println("Account Type: Checking");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int lockInPeriod;

    public FixedDepositAccount(long accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    public void displayAccountType() {
        displayAccountDetails();
        System.out.println("Account Type: Saving Account");
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}
 class BankAccountTypes{
    public static void main(String[] args) {
        SavingsAccount savingsAcc = new SavingsAccount(772587138525L, 5000, 4.5);
        CheckingAccount checkingAcc = new CheckingAccount(772191579623L, 3000, 1000);
        FixedDepositAccount fdAcc = new FixedDepositAccount(7844648364836L, 10000, 12);

        savingsAcc.displayAccountType();
        System.out.println();
        checkingAcc.displayAccountType();
        System.out.println();
        fdAcc.displayAccountType();
    }
}