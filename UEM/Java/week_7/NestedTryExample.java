public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts.");
            int[] numbers = {1, 2, 3};
            int index = 4;

            try {
                // Inner try block
                System.out.println("Inner try block starts.");
                int result = numbers[index]; // Accessing index out of bounds
                System.out.println("Inner try block ends.");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Inner catch block
                System.out.println("Inner catch block: ArrayIndexOutOfBoundsException caught!");
            }

            System.out.println("Outer try block continues.");

            int result = 10 / 0; // Division by zero
            System.out.println("Outer try block ends.");
        } catch (ArithmeticException e) {
            // Outer catch block
            System.out.println("Outer catch block: ArithmeticException caught!");
        }
    }
}

