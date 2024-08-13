public class EquationCalculator {

    public static void main(String[] args) {
        String equation = "10+5*(6/2)-3"; // Example equation
        try {
            double result = calculateEquation(equation);
            System.out.println("Result: " + result);
        } catch (InvalidEquationException e) {
            System.out.println("Invalid equation: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }

    public static double calculateEquation(String equation) throws InvalidEquationException, ArithmeticException {
        // Split the equation into operands and operators
        String[] operands = equation.split("[+\\-*/()]");
        String[] operators = equation.replaceAll("[^+\\-*/]", "").split("(?=[+\\-*/])");

        // Check if the number of operands and operators match
        if (operands.length != operators.length + 1) {
            throw new InvalidEquationException("Invalid equation format");
        }

        // Convert operands to double values
        double[] values = new double[operands.length];
        for (int i = 0; i < operands.length; i++) {
            try {
                values[i] = Double.parseDouble(operands[i]);
            } catch (NumberFormatException e) {
                throw new InvalidEquationException("Invalid operand: " + operands[i]);
            }
        }

        // Calculate the result
        double result = values[0];
        int operatorIndex = 0;
        for (int i = 1; i < values.length; i++) {
            switch (operators[operatorIndex]) {
                case "+":
                    result += values[i];
                    break;
                case "-":
                    result -= values[i];
                    break;
                case "*":
                    result *= values[i];
                    break;
                case "/":
                    if (values[i] == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result /= values[i];
                    break;
            }
            operatorIndex++;
        }
        return result;
    }
}

class InvalidEquationException extends Exception {
    public InvalidEquationException(String message) {
        super(message);
    }
}
