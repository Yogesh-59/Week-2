import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null && !students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Return a copy to prevent external modifications
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Ensure bidirectional relationship
        }
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses); // Return a copy to prevent external modifications
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null && !students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Return a copy to prevent external modifications
    }

    public String getTitle() {
        return title;
    }
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        school.addStudent(student1);
        school.addStudent(student2);

        System.out.println("Courses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getTitle());
        }

        System.out.println("Students enrolled in " + course1.getTitle() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
