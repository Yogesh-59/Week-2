package Multilevel_Inheritance;

class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Name of the Course is: " + courseName);
        System.out.println("Duration of cource: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name of Platform: " + platform);
        System.out.println(" is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private int discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, 
                             boolean isRecorded, double fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Toatl Course Fee: " + fee);
        System.out.println("total Discount: " + discount + "%");
    }
 }
  public class EducationalCourseHierarchy{

    public static void main(String[] args) {
       
        PaidOnlineCourse paidCource = new PaidOnlineCourse( "Atrificial Intelligence", 45, "Bridge-Labz", true, 75890.80, 7);
        paidCource.displayInfo();
    }
}