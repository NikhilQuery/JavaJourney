package Projects_and_Engines;

class Library {
    // Array to store book names and counter for tracking total books
    String[] books;
    int noOfBooks;

    // Constructor initializing library with a max capacity of 100 books
    Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    // Method to add a new book to the storage registry
    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println("Book added successfully: " + book);
    }

    // Method to display all non-null books currently available
    void availableBooks() {
        System.out.println("\n--- Available Books in Library ---");
        for (String book : this.books) {
            if (book == null) {
                continue; // Skip the spots where books were issued or empty
            }
            System.out.println("* " + book);
        }  
    }

    // Method to issue a book by searching and setting its index to null
    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            // Null check prevents NullPointerException when calling .equals()
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("\nSuccess: The book '" + book + "' has been issued.");
                this.books[i] = null; // Freeing the slot
                return;
            }
        }
        System.out.println("\nError: The book '" + book + "' does not exist in our library.");  
    }

    // Method to return an issued book back to the tracking system
    void returnBook(String book) {
        addBook(book);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Instantiating the Central Library System
        Library centerLibrary = new Library();
        
        // Adding initial stock
        centerLibrary.addBook("Rich Dad Poor Dad");
        centerLibrary.addBook("Core Java Volume 1");
        centerLibrary.addBook("Clean Code");
        centerLibrary.availableBooks();

        // Testing Issue Operation
        centerLibrary.issueBook("Core Java Volume 1");
        centerLibrary.availableBooks();
        
        // Testing Return Operation
        centerLibrary.returnBook("Core Java Volume 1");
        centerLibrary.availableBooks();
    }
}
