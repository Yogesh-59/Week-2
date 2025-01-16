import java.util.*;
class PalindromChecker{
  //create variable in text
  String text;
  //this keyword to initialize the value
  PalindromChecker(String text){
     this.text=text;
     }
    //this method use to check the palindrome string
   boolean isPalindrome(){
    String toLower=text.toLowerCase();
    int left=0;
    int right=toLower.length()-1;
    while (left < right){
      if(toLower.charAt(left) !=toLower.charAt(right)){
          return false;
      }
     left++;
     right--;
    }
   return true;
 }
 // In this method to display the result
 void displayResult(){
   if(isPalindrome()){
     System.out.println(text +" given string is palindrome");
    }
    else{
       System.out.println(text +" given string is not palindrome");
    }
 }
   public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
   //take user input as string
     String str=sc.nextLine().trim();
   // create the object of classs
      PalindromChecker checker=new PalindromChecker(str);
     checker.displayResult();
  }
}