public class Employee {
    //make the instances of class
   public static String companyName;
    public static final int employeeID=49;
    public String employeeName;
    public String designation;
    private double salary;
   static int count=0;
    //create the parameterized constructer and initilize to instances
    public Employee(String companyName,String employeeName, String designation, double salary) {
        this.companyName=companyName;
        this.employeeName=employeeName;
        this.designation = designation;
        this.salary = salary;
        count++;
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
    static void displayTotalEmployees(){
       System.out.println("total number of employee is :"+count);
    }
   //In this method use to display the results
    public void displayDetails() {
         System.out.println("company name is :"+companyName);
        System.out.println("Employee name: " + employeeName); 
        System.out.println("Id is :"+employeeID); // Accessing protected member
         System.out.println("designation name : " + designation);
        System.out.println("Salary: " + getSalary()); 
         displayTotalEmployees();
    }
    public static void main(String[] args) {
       //creating class object and call
        Employee emp = new Employee("Capgemini", "Deepraj","SDE", 27800.70);
        if (emp instanceof Employee) {
            System.out.println("emp is an instance of Employee");
        }
        else {
            System.out.println("emp is not instance of Employee");
        }

        emp.displayDetails();
       //update the salary status
        emp.setSalary(45500.50); 
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}