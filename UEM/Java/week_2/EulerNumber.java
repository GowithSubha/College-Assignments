import java.util.Scanner;

public class EulerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of n from the user
        System.out.print("Enter the value of n to compute the value of Euler's number (e): ");
        int n = scanner.nextInt();

        // Compute the value of Euler's number
        double eulerNumber = computeEulerNumber(n);

        System.out.println("The value of Euler's number (e) is approximately: " + eulerNumber);

        scanner.close();
    }

    // Function to compute the value of Euler's number using the provided formula
    public static double computeEulerNumber(int n) {
        double eulerNumber = 1.0; // Initialize with the first term (1/0!)
        double factorial = 1.0; // Initialize factorial to 0!

        for (int i = 1; i <= n; i++) {
            factorial *= i; // Update factorial for the current term (i!)
            eulerNumber += 1.0 / factorial; // Add the current term to the sum
        }

        return eulerNumber;
    }
}

//output
//Enter the value of n to compute the value of Euler's number (e): 70
//The value of Euler's number (e) is approximately: 2.7182818284590455
