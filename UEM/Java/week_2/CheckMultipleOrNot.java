import java.util.Scanner;

public class CheckMultipleOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer values m and n from the user
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Check if m is a multiple of n
        if (isMultiple(m, n)) {
            System.out.println(m + " is a multiple of " + n);
        } else {
            System.out.println(m + " is not a multiple of " + n);
        }

        scanner.close();
    }

    // Function to check if m is a multiple of n
    public static boolean isMultiple(int m, int n) {
        // m is a multiple of n if the remainder of m/n is 0
        return m % n == 0;
    }
}
// output
//Enter the value of m: 56
//Enter the value of n: 8
//56 is a multiple of 8
