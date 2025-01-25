package Single_Inheritance;

class Book {
    public String title;
    public int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Name of Book is: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    private String authorName;
    private String authorBio;

    public Author(String title, int publicationYear, String authorName, String authorBio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.authorBio = authorBio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " +authorName);
        System.out.println("Author Bio: " +authorBio);
    }
}
    public class BookInfo{

    public static void main(String[] args) {
        Author author=new Author("Life Of Student's",2025,"Deepraj","B.tech Student");
        
        author.displayInfo();
    }
}