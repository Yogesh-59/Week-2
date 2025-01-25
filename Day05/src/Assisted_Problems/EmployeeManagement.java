package Assisted_Problems;

abstract class Employee {
    public String name;
    public String id;
    public double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    private final int teamSize;

    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer subclass
class Developer extends Employee {
    private final String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Primary Language: " + programmingLanguage);
    }
}

// Intern subclass
class Intern extends Employee {
    private final String university;

    public Intern(String name, String id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

// Demonstration class
public class EmployeeManagement{
    public static void main(String[] args) {
          Intern in=new Intern("Aryan","32",97580,"UIT RGPV");
            in.displayDetails();
         Manager mg=new Manager("Yogesh","7",756000,21);
           mg.displayDetails();
      Developer dp= new Developer("Hariom","9",45870,"JAVA");
        dp.displayDetails();
    }
}