import java.util.*;
class Item{
  //create the three varible itemCode, itemName and price
  int itemCode;
  String itemName;
  double price;
   //make default constructor and initialize to this keyword
  Item(int itemCode, String itemName, double price){
   this.itemCode=itemCode;
   this.itemName=itemName;
   this.price=price;
  }
   double totalPrice(int quantity){
   return price *quantity;
}
   
  //create method item detail and print the all detail 
   void itemDetail(){
    System.out.println("item Code :"+ itemCode);
    System.out.println("item name :"+itemName);
    System.out.println("item price :"+price);
  }
 public static void main(String[]args){
   Scanner sc =new Scanner(System.in);
   int quantity=sc.nextInt();
   Item it=new Item(25, "Laptop", 60500.50);
   it.itemDetail();
   double ans=it.totalPrice(quantity);
   System.out.println("The given quantity :"+quantity +" and total price is: "+ans);
  }
}