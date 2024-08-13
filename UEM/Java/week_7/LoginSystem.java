import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            login(username, password);
            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String username, String password) throws InvalidCredentialsException {
        if (username.length() < 6) {
            throw new InvalidCredentialsException("Username should be at least 6 characters long.");
        }
        
        // Checking if password matches
        if (!password.equals("password123")) {
            throw new InvalidCredentialsException("Incorrect password.");
        }
    }
}

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
