import java.util.Scanner;

public class RecruitmentSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate age: ");
        int age = scanner.nextInt();

        try {
            checkAgeCriteria(age);
            System.out.println("Candidate is eligible.");
            System.out.println("Candidate name: " + name);
        } catch (TooOlderException e) {
            System.out.println("Candidate is too older!");
        } catch (TooYoungerException e) {
            System.out.println("Candidate is too younger!");
        }
    }

    public static void checkAgeCriteria(int age) throws TooOlderException, TooYoungerException {
        if (age > 45) {
            throw new TooOlderException();
        } else if (age < 20) {
            throw new TooYoungerException();
        }
    }
}

class TooOlderException extends Exception {
    public TooOlderException() {
        super("Candidate is too older");
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException() {
        super("Candidate is too younger");
    }
}
