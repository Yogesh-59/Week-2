package BankingSystem;

 class SavingsAccount extends BankAccount implements Loanable {
     private double interestRate;

     public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
         super(accountNumber, holderName, initialBalance);
         this.interestRate = 0.05;
     }

     @Override
     public double calculateInterest() {
         return balance * interestRate;
     }

     @Override
     public boolean applyForLoan(double loanAmount) {
         return calculateLoanEligibility() >= loanAmount;
     }

     @Override
     public double calculateLoanEligibility() {
         return balance * 1.5;
     }
}
