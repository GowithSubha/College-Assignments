public class Factorial {
    private static final int MAX_VALUE = 20; // Maximum value supported by long type for factorial calculation
    private static final long[] factorialResults = new long[MAX_VALUE + 1];

    public static void main(String[] args) {
        try {
            long result = computeFactorial(10); // Example: Compute factorial of 10
            System.out.println("Factorial of 10: " + result);

            result = computeFactorial(21); // Example: Try to compute factorial of 21
            System.out.println("Factorial of 21: " + result); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    public static long computeFactorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }

        if (x > MAX_VALUE) {
            throw new IllegalArgumentException("Result will overflow");
        }

        if (factorialResults[x] != 0) {
            return factorialResults[x];
        }

        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
            factorialResults[i] = result;
        }

        return result;
    }
}
