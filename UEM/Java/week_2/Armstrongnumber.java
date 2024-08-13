import java.util.Scanner;

public class Armstrongnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        // Check if the number is Armstrong
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Count number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the number is Armstrong
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
// output
//Enter a number to check if it's an Armstrong number: 296
//296 is not an Armstrong number.

