import java.util.Scanner;

public class StudentScoresApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] studentIDs = {"S001", "S002", "S003", "S004", "S005"};
        int[] testScores = new int[studentIDs.length];

        for (int i = 0; i < studentIDs.length; i++) {
            try {
                System.out.print("Enter test score for student " + studentIDs[i] + ": ");
                int score = Integer.parseInt(scanner.nextLine());
                validateScore(score);
                testScores[i] = score;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric score.");
                testScores[i] = 0;
            } catch (ScoreException e) {
                System.out.println(e.getMessage());
                testScores[i] = 0;
            }
        }

        System.out.println("\nStudent IDs and Scores:");
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println(studentIDs[i] + ": " + testScores[i]);
        }
    }

    public static void validateScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException("Invalid score! Score must be between 0 and 100.");
        }
    }
}

class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);
    }
}
