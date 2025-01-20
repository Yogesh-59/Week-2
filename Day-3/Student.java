import java.util.*;
class Student{
  //create three varible student name ,roll number and marks
  public static String universityName;
  public String name;
  public final int rollNumber;
  private double marks;
  static int count=0;
  Student(String universityName,String name, int rollNumber, double marks){
   this.name=name;
   this.rollNumber=rollNumber;
   this.marks=marks;
   this.universityName=universityName;
  count++;
  }
  static void displayTotalStudents(){
     System.out.println("Total number of Student is :"+count);
  }
  String calculateGrade(){
   if(marks >=85){
      return "A+";
     }
    else if(marks >=75 && marks <85){
      return "A";
     }
    else if(marks >=60 && marks<75){
      return "B";
    }
    else if(marks >=40 && marks <60){
     return "C";
    }
    else{
     return "D";
   }
 }
  void studentDetail(){
     String grade=calculateGrade();
   System.out.println("university name is :"+universityName);
   System.out.println("student name :"+name);
   System.out.println("student roll number :"+rollNumber);
   System.out.println("student marks :"+marks);
   System.out.println("student grade :"+grade);
  }
  public static void main(String[]args){
    Student st=new Student("UIT RGPV","Deepraj", 49, 83.9);
     if (st instanceof Student) {
            System.out.println("st is instance of Student");
        }
        else {
            System.out.println("st is not instance of Student");
        }

    st.studentDetail();
   }
}