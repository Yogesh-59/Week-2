import java.util.*;
class Circle{
  //create one veriable name is radius
  double radius;
   //make default constructor to initialize the value
   Circle(double radius){
    this.radius=radius;
  }
  //method to calculate the area of circle
   double calculateAreaOfCircle(){
     return Math.PI *radius *radius;
  }
  //method to calculate the curcumference of circle
   double calculateCircumference(){
     return 2* Math.PI *radius;
  }
  // method to display the result
  void displayResult(){
   System.out.println("The area of circle is :"+calculateAreaOfCircle());
   System.out.println("The circumference of circle is :"+calculateCircumference());
  }
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
   // take user input as redius
     double radius=sc.nextDouble();
     Circle cr=new Circle(radius);
     cr.displayResult();
   }
 }