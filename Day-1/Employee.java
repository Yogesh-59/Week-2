import java.util.*;
class Employee{
   //create three variable name, id and salary
    String name;
    int id;
    double salary;
   //make default constructor Employee
    Employee(String name,int id ,double salary){
    // 'this.name refers to the instance variable while name refers to the parameter
      this.name=name;
      this.id=id;
      this.salary=salary;
   }
  //this method to display the detail of employee
   void displayDetail(){
    System.out.println("Employee name :"+name);
    System.out.println("Employee id :"+id);
    System.out.println("Employee salary :"+salary);
 }
  public static void main(String[] args){
  //create an instance or object of the Employee
    Employee emp=new Employee( "Deepraj", 49, 1000000.8767);
    emp.displayDetail();
  }
}