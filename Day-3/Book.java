public class Book {
   //make instances of class
   static String libraryName;
    public static final String ISBN="20-3433454-34343";
    protected String title;
    private String author;
   //make parameterized constructor to initilize the instance
    public Book(String libraryName, String title, String author) {
        
        this.title = title;
        this.author = author;
        this.libraryName=libraryName;
    }
    static void displayLibraryName(){
      System.out.println(" Library Name is :"+libraryName);
   }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member from superclass
        System.out.println("Title: " + title); // Accessing protected member from superclass
        System.out.println("Author: " + author); // Accessing private member through getter
        
    }

    public static void main(String[] args) {
        //creating the sub class object and call
        Book book = new Book("The Future Programmer", "Advance Java", "James Gosling");
        if (book instanceof Book) {
            System.out.println("obj is an instance of Book");
        }
        else {
            System.out.println("obj is not instance of Book");
        }

        book.displayDetails(); 
        displayLibraryName();
    }
}