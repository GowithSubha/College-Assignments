import java.util.Scanner;

public class PrimeNumberInInterval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the interval from the user
        System.out.print("Enter the starting number of the interval: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the interval: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Display prime numbers in the interval
        displayPrimeNumbers(start, end);

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to display prime numbers within an interval
    public static void displayPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

//output
//Enter the starting number of the interval: 5
//Enter the ending number of the interval: 50
//Prime numbers between 5 and 50 are:
//5 7 11 13 17 19 23 29 31 37 41 43 47 