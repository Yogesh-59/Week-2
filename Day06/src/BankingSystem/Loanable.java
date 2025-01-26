package BankingSystem;

 interface Loanable {
     boolean applyForLoan(double loanAmount);
     double calculateLoanEligibility();
}
