import java.util.*;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "The Boys";
        author = "KK Patel";
        price = 182.98;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void displayResult() {
        System.out.println("Title of the book: " + title);
        System.out.println("author of book: " + author);
        System.out.println("price of the book: " + price);
    }

    public static void main(String[] args) {
     //call default constructer and make there object
     Book bk=new Book();
      bk.displayResult();
    //make perameterize constructer and pass some perameter 
     Book bk1=new Book("The AI", "DR Lodhi", 999.75);
     bk1.displayResult();
    }
}
