import java.util.ArrayList;
import java.util.List;

class Book {
   //create instance of class
    private String title;
    private String author;
  //construct parameterized constuctor to initialize the object
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
   //use getter setter to get the input
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    //over ride this method to super class to chile class
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library {
  //decleare the list books
    private List<Book> books;
  //initialize the instance 
    public Library() {
        this.books = new ArrayList<>();
    }
    //make method to add book
    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
    public static void main(String[] args) {
        // create Book objects
        Book book = new Book("How to Get Success", "Dr. Lodhi");
        Book book1 = new Book("How to Become Rich", "Elon Musk");

        // create Library objects
        Library library = new Library();
        Library library1 = new Library();

        // Add books to libraries
        library.addBook(book);
        library1.addBook(book1);

        // Print library information
        System.out.println(library);
        System.out.println(library1);
    }
}