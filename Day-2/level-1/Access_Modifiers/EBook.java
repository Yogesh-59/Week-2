public class Book {
   //make instances of class
    public String ISBN;
    protected String title;
    private String author;
   //make parameterized constructor to initilize the instance
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
   //use get set method to set author name
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
//make subclass of Book
class EBook extends Book {

    private String format; 

    public EBook(String ISBN, String title, String author, String format) {
       //use super keyword to access the instance in super class 
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member from superclass
        System.out.println("Title: " + title); // Accessing protected member from superclass
        System.out.println("Author: " + getAuthor()); // Accessing private member through getter
        System.out.println("Format: " + format);
    }

    public static void main(String[] args) {
        //creating the sub class object and call
        EBook ebook = new EBook("18-2025012005", "Advance Java", "James Gosling", "PDF");
        ebook.displayDetails(); 
    }
}