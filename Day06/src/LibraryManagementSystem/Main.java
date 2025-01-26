package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<LibraryItem> libraryItems = new ArrayList<>();

        Book book = new Book("B2021", "The Future Get Started", "Deepraj", "Motivation");
        Magazine magazine = new Magazine("M2022", "The Man Of The Year", "Yogesh", "Dec 2024");
        DVD dvd = new DVD("D2025", "The New Journey Of Life", "DR Lodhi", "Educational");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        // Polymorphic processing
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check reservability
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available: " + reservableItem.checkAvailability());
            }
            System.out.println();
        }
    }
}
