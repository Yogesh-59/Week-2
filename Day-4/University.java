import java.util.ArrayList;
import java.util.*;
public class Department {
    private String name;
    private List<Faculty> faculty;
    private boolean isDestroyed = false;

    public Department(String name) {
        this.name = name;
        this.faculty = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        if (!isDestroyed) {
            this.faculty.add(faculty);
        }
    }

    public void destroy() {
        // Aggregation: faculty members continue to exist
        faculty.clear();
        isDestroyed = true;
        System.out.println("Department " + name + " destroyed");
    }
}

public class Faculty {
    private String name;
    private String specialty;

    public Faculty(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Faculty{name='" + name + "', specialty='" + specialty + "'}";
    }
}
public class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void destroy() {
        // Composition: explicitly destroy departments
        for (Department dept : departments) {
            dept.destroy();
        }
        departments.clear();
        System.out.println("University " + name + " destroyed");
    }
    public static void main(String[] args) {
        University university = new University("UIT RGPV BHOPAL");
        
        Department cs = new Department("Computer Science");
        Department math = new Department("AIML");
        
        Faculty prof1 = new Faculty("Dr.Boghey", "AI");
        Faculty prof2 = new Faculty("Dr.Nichal", "Algorithms");
        
        cs.addFaculty(prof1);
        math.addFaculty(prof2);
        
        university.addDepartment(cs);
        university.addDepartment(math);
        
        // Demonstrate destruction
        university.destroy();
        
        // Prof1 and Prof2 still exist and can be reassigned
        System.out.println("Faculty still exists: " + prof1);
        
        Department newDept = new Department("New Department");
        newDept.addFaculty(prof1);  // Faculty can be added to new department
    }
}