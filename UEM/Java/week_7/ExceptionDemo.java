public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            // Generating NegativeArraySizeException
            generateNegativeArraySizeException();
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        try {
            // Generating ArithmeticException
            generateArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    public static void generateNegativeArraySizeException() {
        try {
            int[] array = new int[-3]; // Trying to create an array with negative size
        } catch (NegativeArraySizeException e) {
            throw e; // Re-throwing the exception to be caught in the main method
        }
    }

    public static void generateArithmeticException() {
        try {
            int result = divide(10, 0); // Attempting to divide by zero
        } catch (ArithmeticException e) {
            throw e; // Re-throwing the exception to be caught in the main method
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
