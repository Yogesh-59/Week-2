package LibraryManagementSystem;

class Book extends LibraryItem implements Reservable{
    private String genre;

    public Book(String itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
    }

    @Override
    public int getLoanDuration() {
        return 25;
    }

    @Override
    public boolean reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
