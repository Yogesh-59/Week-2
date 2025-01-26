package LibraryManagementSystem;

class Magazine extends LibraryItem implements Reservable{
    private String issue;

    public Magazine(String itemId, String title, String author, String issue) {
        super(itemId, title, author);
        this.issue = issue;
    }

    @Override
    public int getLoanDuration() {
        return 7;
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
