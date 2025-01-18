import java.util.*;

public class  LibraryBookSystem{
     String title;
     String author;
     double price;
     boolean availability;

    // Default constructor
    LibraryBookSystem() {
     title="The night change";
     author="Dr.Lodhi";
     price=2500.75;
     availability=true;
    }

    // Parameterized constructor
    LibraryBookSystem( String title,String author,double price, boolean availability) {
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    boolean borrowBook(boolean availability){
      if(availability){
        availability=false;
      return true;
     }
     else{
       return false;
     }
    }
    void displayResult(){
    System.out.println("Name of book is :"+title +" book author is :"+author +" price of book :"+price+ " availability status :"+ (borrowBook(availability) ==true? "Yes" :"No"));
  }
    public static void main(String[] args) {
    
     //call default constructer and make there object
     LibraryBookSystem obj=new LibraryBookSystem();
      obj.displayResult();
     // create parameterize constructor obj 
     LibraryBookSystem obj1=new LibraryBookSystem("Stereo Love","Jim classy",250.75, true);
      obj1.displayResult();
    
    }
}
