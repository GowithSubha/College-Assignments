import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
    }
}

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

