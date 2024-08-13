import java.util.Scanner;

public class StringComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        try {
            compareStrings(str1, str2);
            System.out.println("The strings are equal (ignoring case).");
        } catch (StringMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void compareStrings(String str1, String str2) throws StringMismatchException {
        if (!str1.equalsIgnoreCase(str2)) {
            throw new StringMismatchException("String Mismatch Exception: The strings are not equal (ignoring case).");
        }
    }
}

class StringMismatchException extends Exception {
    public StringMismatchException(String message) {
        super(message);
    }
}

