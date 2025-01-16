import java.util.*;
class Book{
  //create the three varible title, author and price
  String title;
  String author;
  double price;
   //make default constructor and initialize to this keyword
  Book(String title, String author, double price){
   this.title =title;
   this.author=author;
   this.price=price;
  }
  //create method book detail and print the all detail 
   void bookDetail(){
    System.out.println("Book name :"+ title);
    System.out.println("Book author name :"+author);
    System.out.println("Book price :"+price);
  }
 public static void main(String[]args){
   Scanner sc =new Scanner(System.in);
   Book book=new Book("The Boys", "Deepraj", 550.50);
   book.bookDetail();
  }
}