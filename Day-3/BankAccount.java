public class BankAccount{
   public static String bankName;// declear the static varible
   private String accountHolderName;
   private static int count=0;
   private static double balance;
   private static final long accountNumber=772587138525L;// use final key word to account number is final 
  // create parameterized constructor to initilize the varible  
   BankAccount(String bankName, String accountHolderName,double balance){
     this.bankName=bankName;
     this.accountHolderName=accountHolderName;
     this.balance=balance;
     count++;
  }
  //make the method to update the bank balance
  static double creditAmount(double amount){
    if (amount >0){
       return balance+amount;
     }
    else{
     return balance;
  }
}
  //method to check withdraw amount is valid or not
  static double withDrawAmmount(double withDraw){
   if (withDraw >balance && withDraw <0){
     return 0;
   }
  else{
    balance -=withDraw;
    return withDraw;
 }
}
  void displayResult(){
  System.out.println("Bank name is :"+bankName);
  System.out.println("Account holder name is :"+accountHolderName);
  System.out.println("Bank account number is :"+accountNumber);
  System.out.println("Bank balance is :"+balance);
  System.out.println("total Account number is :"+count);
}
 public static void main(String []args){
 //create the object of bank account and call
  BankAccount obj= new BankAccount("SBI" , "Deepraj", 999999978675.90);
   //check object is instance of BankAccount
        if (obj instanceof BankAccount) {
            System.out.println("obj is an instance of BankAccount");
        }
 //display the results
  obj.displayResult();
 System.out.println("withraw ammount is :"+withDrawAmmount(276346.98));
 System.out.println("creadit amount than total balance is :"+creditAmount(374646534.98));
}
}
  
   