import java.util.Scanner;

public class QuizManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctAnswers = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Question " + i + ":");
            System.out.print("What is the capital of France? ");
            String answer = scanner.nextLine();

            try {
                checkAnswer(answer);
                System.out.println("Good! The answer is correct.");
                correctAnswers++;
            } catch (NotCorrectException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Total correct answers: " + correctAnswers);
    }

    public static void checkAnswer(String answer) throws NotCorrectException {
        if (!answer.equalsIgnoreCase("Paris")) {
            throw new NotCorrectException("Incorrect! The correct answer is Paris.");
        }
    }
}

class NotCorrectException extends Exception {
    public NotCorrectException(String message) {
        super(message);
    }
}

