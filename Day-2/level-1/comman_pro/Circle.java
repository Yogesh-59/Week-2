import java.util.*;

public class Circle {
     private double radius;

    // Default constructor
    Circle() {
        this.radius=7.5;
    }

    // Parameterized constructor
    Circle( double radius) {
        this.radius=(radius >0 ? radius :1.0);
    }

      double areaOfCircle(double radius){
       return Math.PI * radius *radius;
    }
    void displayResult(){
    System.out.println("The radius of circle is :"+radius +" And area of circle is :"+areaOfCircle(radius));
  }
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
   //take user input 
     double radius =sc.nextDouble();
     //call default constructer and make there object
      Circle cr=new Circle();
      cr.displayResult();
    //make perameterize constructer and pass some perameter 
     Circle cr1=new Circle(radius);
     cr1.displayResult();
    }
}
