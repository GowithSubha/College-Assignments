class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CommandLineAddition {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Insufficient arguments. At least 5 arguments are required.");
            }

            int sum = 0;
            for (String arg : args) {
                try {
                    int num = Integer.parseInt(arg);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid argument: " + arg);
                }
            }

            System.out.println("Sum of all five numbers: " + sum);
        } catch (CheckArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

