package LibraryManagementSystem;

 class DVD extends LibraryItem {
     private String genre;

     public DVD(String itemId, String title, String author, String genre) {
         super(itemId, title, author);
         this.genre = genre;
     }

     @Override
     public int getLoanDuration() {
         return 16;
     }
}
