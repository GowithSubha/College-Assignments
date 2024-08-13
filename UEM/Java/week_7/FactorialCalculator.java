public class FactorialCalculator {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No argument provided");
            }
            
            int value = Integer.parseInt(args[0]);
            if (value == 0) {
                throw new IllegalArgumentException("Value cannot be 0");
            }

            long factorial = computeFactorial(value);
            System.out.println("Factorial of " + value + " is: " + factorial);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide an integer value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static long computeFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

