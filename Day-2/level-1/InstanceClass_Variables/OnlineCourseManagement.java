public class OnlineCourseManagement {
    // create Instance variables 
    private String courseName;
    private int duration;
    private double fee;
    // make one Class variable with shared among all
    private static String instituteName = "UIT RGPV BHOPAL"; 
    // Constructor to initialize instance variables
    public OnlineCourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
   //create one copy constructor they are copy of parameterized constructor
    OnlineCourseManagement(OnlineCourseManagement cource){
      this.courseName = cource.courseName;
      this.duration = cource.duration;
      this.fee = cource.fee;
   }
    //make method to display the cource detail
    public void displayCourseDetails() {
        System.out.println("Online Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("cource Fee: " + fee);
        System.out.println("Institute name is : " + instituteName); 
    }
    //create method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
       //call parameterized constructor and make there object
        OnlineCourseManagement ocm=new OnlineCourseManagement("Java Fullstack",24,75280);
         ocm.displayCourseDetails();
       // update the institute name
        OnlineCourseManagement.updateInstituteName("Technocrats Institute of Technology Excellence");
      //call copy constructor and make there object
        OnlineCourseManagement ocm1 =new OnlineCourseManagement(ocm);
       //update the cource name and fees 
        ocm1.courseName="Artificial Intelligence";
        ocm1.fee=85900.7525;

        ocm1.displayCourseDetails();
    }
}