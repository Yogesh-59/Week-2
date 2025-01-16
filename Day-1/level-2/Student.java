import java.util.*;
class Student{
  String name;
  int rollNumber;
  double marks;
  Student(String name, int rollNumber, double marks){
   this.name=name;
   this.rollNumber=rollNumber;
   this.marks=marks;
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
   System.out.println("student name :"+name);
   System.out.println("student roll number :"+rollNumber);
   System.out.println("student marks :"+marks);
   System.out.println("student grade :"+grade);
  }
  public static void main(String[]args){
    Student st=new Student("Deepraj", 49, 83.9);
    st.studentDetail();
   }
}