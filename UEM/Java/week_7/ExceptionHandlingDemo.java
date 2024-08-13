public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            // Using try-catch block to handle exceptions
            int result = divide(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } finally {
            // Using finally block to execute code regardless of exception occurrence
            System.out.println("Finally block executed");
        }

        try {
            // Using throw keyword to manually throw an exception
            throw new NullPointerException("This is a custom NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("Caught custom NullPointerException: " + e.getMessage());
        }

        try {
            // Using throws keyword in method signature to declare an exception
            throwsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // Using try-with-resources to automatically close resources (such as streams)
            // This requires implementing AutoCloseable interface
            tryWithResources();
        } catch (Exception e) {
            System.out.println("Caught exception in try-with-resources: " + e.getMessage());
        }

        // Using assert keyword to perform assertions
        assert (5 > 10) : "Assertion failed: 5 is not greater than 10";
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void throwsException() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("This is a custom ArrayIndexOutOfBoundsException");
    }

    public static void tryWithResources() throws Exception {
        try (Resource resource = new Resource()) {
            // Using try-with-resources with a custom resource
            resource.useResource();
        }
    }

    static class Resource implements AutoCloseable {
        public void useResource() throws Exception {
            System.out.println("Resource being used");
            throw new Exception("Exception in resource usage");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Resource closed");
        }
    }
}
