import java.util.*;

public class Person{
     String name;
     double age;
     double height;

    // Default constructor
    Person() {
        name="Deepraj";
        age=20;
        height=184.25;
    }

    // Parameterized constructor
    Person(Person person1) {
        this.name=person1.name;
        this.age=person1.age;
        this.height=person1.height;
    }
    void displayResult(){
    System.out.println("Name of person is :"+name +" age is :"+age +" and height of person :"+height);
  }
    public static void main(String[] args) {
    
     //call default constructer and make there object
      Person pr=new Person();
      pr.displayResult();
    //call copy constructor and make object 
     Person pr1=new Person(pr);
     pr1.name="Aryan";
     pr1.displayResult();
    }
}
