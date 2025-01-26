package BankingSystem;

class CurrentAccount extends BankAccount implements Loanable{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = 5000;
    }

    @Override
    public double calculateInterest() {
        return balance > 0 ? balance * 0.02 : 0;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean applyForLoan(double loanAmount) {
        return calculateLoanEligibility() >= loanAmount;
    }

    @Override
    public double calculateLoanEligibility() {
        return balance + overdraftLimit;
    }
}
