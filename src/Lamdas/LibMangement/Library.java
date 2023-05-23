package Lamdas.LibMangement;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

    public class Library {
        private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public Supplier<Book> createBook = Book::new;

        public Predicate<Book> isBookAvailable = Book::getAvailable;

        public Consumer<Book> printBookDetails = book -> {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Category: " + book.getCategory());
            System.out.println();
        };

        public void addBook(Book book) {
            books.add(book);
        }


        public void removeBook(String title) {
            books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        }

        public List<Book> findBooksByPublicationYear(int year) {
            return books.stream()
                    .filter(book -> book.getPublicationYear() == year)
                    .collect(Collectors.toList());
        }

        public List<Book> findBooksByAuthor(String author) {
            return books.stream()
                    .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
        }

        public Book findBookWithMostPages() {
            return books.stream()
                    .max(Comparator.comparingInt(Book::getPages))
                    .orElse(null);
        }

        public List<Book> findBooksByMinPages(int minPages) {
            return books.stream()
                    .filter(book -> book.getPages() > minPages)
                    .collect(Collectors.toList());
        }

        public List<String> getAllBookTitlesSorted() {
            return books.stream()
                    .map(Book::getTitle)
                    .sorted()
                    .collect(Collectors.toList());
        }

        public List<Book> findBooksByCategory(String category) {
            return books.stream()
                    .filter(book -> book.getCategory().equalsIgnoreCase(category))
                    .collect(Collectors.toList());
        }


        public void loanOutBook(Book book) {
            if (!book.isOnLoan()) {
                book.setLoanStatus(true);
                System.out.println("Book '" + book.getTitle() + "' has been loaned out.");
            } else {
                System.out.println("Book '" + book.getTitle() + "' is already on loan.");
            }
        }

        public void returnBook(Book book) {
            if (book.isOnLoan()) {
                book.setLoanStatus(false);
                System.out.println("Book '" + book.getTitle() + "' has been returned.");
            } else {
                System.out.println("Book '" + book.getTitle() + "' is not currently on loan.");
            }
        }


        public static void main(String[] args) {

            Library library = new Library();

            Book book1 = new Book("Book Uno", "Dr. Seuss", 2023, 999, "NonFiction");
            Book book2 = new Book("Book Dos", "Shel Silverstein", 2022, 999, "NonFiction");
            Book book3 = new Book("Book Tres", "Charles Dickens", 2021, 999, "NonFiction");


            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);


            List<String> sortedTitles = library.getAllBookTitlesSorted();
            System.out.println("All Books:");
            for (String title : sortedTitles) {
                System.out.println(title);
            }
            System.out.println();


            List<Book> booksByAuthor = library.findBooksByAuthor("Dr Seuss);
            System.out.println("Dr. Suess' books:");
            for (Book book : booksByAuthor) {
                library.printBookDetails.accept(book);
            }


            library.loanOutBook(book1);


            User user = new User("JimBo", "999");

            user.borrowBook(book1);

            user.borrowBook(book1);

            user.returnBook(book1);

            library.removeBook("Books Dos");

            Book bookWithMostPages = library.findBookWithMostPages();
            System.out.println("The Book with Most Pages:");
            library.printBookDetails.accept(bookWithMostPages);
        }


    }
