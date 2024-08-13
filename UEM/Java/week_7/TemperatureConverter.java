class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java TemperatureConverter <temperature in Celsius>");
            System.exit(1);
        }

        try {
            double celsius = Double.parseDouble(args[0]);

            if (celsius > 35) {
                throw new TooHotException("Temperature is too hot!");
            } else if (celsius < 5) {
                throw new TooColdException("Temperature is too cold!");
            } else {
                System.out.println("Normal");
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please provide a valid numeric temperature.");
        } catch (TooHotException | TooColdException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
