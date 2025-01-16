import java.util.*;
class MobilePhone{
  //create the three varible itemCode, itemName and price
  String brand;
  String model;
  double price;
   //make default constructor and initialize to this keyword
  MobilePhone(String brand, String model, double price){
   this.brand=brand;
   this.model=model;
   this.price=price;
  }
  //create method mobile phone detail and print the all detail 
   void mobileDetail(){
    System.out.println("mobile brand :"+ brand);
    System.out.println("mobile model :"+model);
    System.out.println("mobile price :"+price);
  }
 public static void main(String[]args){
   MobilePhone mp=new MobilePhone("Samsung", "S-20 Ultra", 120500.50);
   mp.mobileDetail();
  }
}