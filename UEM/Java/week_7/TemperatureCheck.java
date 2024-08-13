public class TemperatureCheck {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TemperatureCheck <temperature_in_celsius>");
            return;
        }

        double temperatureCelsius;
        try {
            temperatureCelsius = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature format. Please enter a number.");
            return;
        }

        try {
            checkTemperature(temperatureCelsius);
            double temperatureFahrenheit = convertCelsiusToFahrenheit(temperatureCelsius);
            System.out.println("Normal temperature");
            System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit.\n", temperatureCelsius, temperatureFahrenheit);
        } catch (TooHotException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (TooColdException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static void checkTemperature(double temperature) throws TooHotException, TooColdException {
        if (temperature > 35) {
            throw new TooHotException("Temperature is too hot!");
        } else if (temperature < 5) {
            throw new TooColdException("Temperature is too cold!");
        }
    }

    static class TooHotException extends Exception {
        public TooHotException(String message) {
            super(message);
        }
    }

    static class TooColdException extends Exception {
        public TooColdException(String message) {
            super(message);
        }
    }
}

