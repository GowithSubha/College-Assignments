import java.util.Scanner;

public class LibraryManagementSystem {

    private static final String[] books = {"Java Programming", "Python for Beginners", "Data Structures and Algorithms"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book title to search: ");
        String bookTitle = scanner.nextLine();

        try {
            searchBook(bookTitle);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void searchBook(String bookTitle) throws BookNotFoundException {
        boolean found = false;
        for (String book : books) {
            if (book.equalsIgnoreCase(bookTitle)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new BookNotFoundException("Book '" + bookTitle + "' not found in the library.");
        }
    }
}

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

