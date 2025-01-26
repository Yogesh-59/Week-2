package BankingSystem;
import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        ArrayList<BankAccount> accounts = new ArrayList<>();

        SavingsAccount saveAcc = new SavingsAccount("SBI-77258713852005", "Deepraj", 999999989.99);
        CurrentAccount currAcc = new CurrentAccount("BOI-75096678402505", "Yogesh", 988448745.90);

        accounts.add(saveAcc);
        accounts.add(currAcc);

        // Polymorphic processing
        for (BankAccount account : accounts) {
            System.out.println("Account Holder name is: " + account.getHolderName());
            System.out.println("total Balance of Account is: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            // Check loan eligibility
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanableAccount.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}
