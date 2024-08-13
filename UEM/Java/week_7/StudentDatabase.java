import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        int[] marks = new int[6];

        try {
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                validateMarks(marks[i]);
            }

            int totalMarks = calculateTotalMarks(marks);
            double percentage = calculatePercentage(totalMarks);

            System.out.println("\nStudent's Name: " + name);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        } catch (RangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void validateMarks(int marks) throws RangeException {
        if (marks < 0 || marks > 50) {
            throw new RangeException("Marks should be between 0 and 50");
        }
    }

    private static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    private static double calculatePercentage(int totalMarks) {
        return ((double) totalMarks / (6 * 50)) * 100;
    }
}

class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}
