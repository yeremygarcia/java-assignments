package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> ourLibraryApp = new LibraryManager<>();


        Book book1 = new Book("The Cat in the Hat", 1957, "Dr. Seuss", "ISBN 123");
        Book book2 = new Book("Green Eggs and Ham", 1960, "Dr. Seuss", "ISBN 456");
        DVD dvd1 = new DVD("The Lorax", 2012, "Chris Renaud", 120);
        DVD dvd2 = new DVD("The Grinch", 2018, "Scott Mosier", 120);

        ourLibraryApp.addItem(book1);
        ourLibraryApp.addItem(book2);
        System.out.println("Here's book 1 and 2: ");
        ourLibraryApp.displayItems();
        System.out.println(" ");
        System.out.println("I am removing book 1 and adding DVDs:");
        ourLibraryApp.removeItem(book2);
        ourLibraryApp.addItem(dvd1);
        ourLibraryApp.addItem(dvd2);
        ourLibraryApp.displayItems();
        System.out.println(" ");
    }
}
