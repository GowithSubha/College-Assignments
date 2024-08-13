import java.util.Scanner;

public class PositiveNumberValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            validatePositive(number);
            System.out.println("The number " + number + " is positive.");
        } catch (NotPositiveNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validatePositive(int number) throws NotPositiveNumberException {
        if (number <= 0) {
            throw new NotPositiveNumberException("The number is not positive.");
        }
    }
}

class NotPositiveNumberException extends Exception {
    public NotPositiveNumberException(String message) {
        super(message);
    }
}
