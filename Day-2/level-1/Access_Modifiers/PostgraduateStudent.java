    class Student {
    //create instance variable 
    public int rollNumber;
    protected String name;
    public double CGPA;

    //make Constructor for Student
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + (CGPA > 0 && CGPA <= 10 ? CGPA : "Enter Valid CGPA"));
    }
}

public class PostgraduateStudent extends Student {

    private String specialization;

    // constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); 
        // Call the Student constructor
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    @Override
    public void displayDetails() {
        super.displayDetails(); 
       // Call the superclass's displayDetails() method
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        // Create a Student object
        Student ugstu = new Student(49, "Deepraj", 8.31);
        System.out.println("Undergraduate Student Details:");
        ugstu.displayDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStu = new PostgraduateStudent(70, "Yogesh", 9.5, "Mobility and Automation");
        System.out.println("\nPostgraduate Student Details:");
        pgStu.displayDetails();
    }
}
