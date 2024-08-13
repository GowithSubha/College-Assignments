// Define custom exception NoMatchFoundException
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

// Main program demonstrating the usage of NoMatchFoundException
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            checkString("College"); // Pass a string that doesn't match
        } catch (NoMatchFoundException e) {
            System.out.println("Caught NoMatchFoundException: " + e.getMessage());
        }

        try {
            checkString("University"); // Pass a string that matches
        } catch (NoMatchFoundException e) {
            System.out.println("Caught NoMatchFoundException: " + e.getMessage());
        }
    }

    public static void checkString(String input) throws NoMatchFoundException {
        if (!input.equals("University")) {
            throw new NoMatchFoundException("String does not match 'University'");
        }
    }
}
