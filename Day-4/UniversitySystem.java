import java.util.*;

// Student Class
class Student {
   //make student class object
    private String name;
    private int studentId;
    private List<Course> courses;
   //use constructor to initialize the instances
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }
  //method to name of student they enroll this course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public List<Course> getCourses() {
        return courses;
    }
}

//creating professor Class
class Professor {
    private String name;//instances
    private int professorId;
    private List<Course> courses;

    public Professor(String name, int professorId) {
        this.name = name;
        this.professorId = professorId;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this);
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Course Class
class Course {
    private String courseName;
    private int courseId;
    private Professor professor; // Aggregation: Course has a Professor
    private List<Student> students; // Aggregation: Course has many Students

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Professor getProfessor() {
        return professor;
    }
}

// Main Class to Test
public class UniversitySystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Deepak",89);
        Student student2 = new Student("Prince", 102);

        // Create professor
        Professor professor = new Professor("Dr.Boghey", 201);

        // Create course
        Course course = new Course("Nischal kaushal` ", 301);

        // Assign professor to the course
        professor.assignCourse(course);

        // Enroll students in the course
        student1.enrollCourse(course);
        student2.enrollCourse(course);

        // Display students in the course
        System.out.println("Students in " + course.getCourseName() + ":");
        for (Student student : course.getStudents()) {
            System.out.println("- " + student.getCourses().get(0).getCourseName());
        }

        // Display professor of the course
        System.out.println("Professor teaching " + course.getCourseName() + ": " + course.getProfessor().getCourses().get(0).getCourseName());
    }
}
