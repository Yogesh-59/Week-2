public class Employee {
    //make the instances of class
    public int employeeID;
    protected String department;
    private double salary;
    //create the parameterized constructer and initilize to instances
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    //using get, set method to set the salary 
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }
}
//create subclass of superclass and they have to use the property of base class
class Manager extends Employee {

    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
       //using super keyword to access the instances of superclass
        super(employeeID, department, salary);
        this.team = team;
    }
   //In this method use to display the results
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID); 
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Salary: " + getSalary()); 
        System.out.println("Team: " + team);
    }
    public static void main(String[] args) {
       //creating class object and call
        Manager manager = new Manager(100, "IT", 27800.70, "Development");
        manager.displayDetails();
       //update the salary status
        manager.setSalary(45500.50); 
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}