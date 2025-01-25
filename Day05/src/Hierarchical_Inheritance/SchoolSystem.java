package Hierarchical_Inheritance;

 class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayBasicInfo() {
        System.out.println("Name of person is: " + name);
        System.out.println("Age of person: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        displayBasicInfo();
        System.out.println("Role of person: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        displayBasicInfo();
        System.out.println("Role of person: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        displayBasicInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
 }
   class SchoolSystem{

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Rajesh Boghey", 39, "TOC");
        Student student = new Student("Deepraj", 20, 10);
        Staff staff = new Staff("DR. Sharma", 42, "Director");

        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}