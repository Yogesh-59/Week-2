package LibraryManagementSystem;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    protected boolean isAvailable;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
