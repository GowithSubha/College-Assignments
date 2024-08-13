import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String input = scanner.nextLine();

        try {
            int decimal = convertBinaryToDecimal(input);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (WrongNumberFormatException e) {
            System.out.println("Wrong number format! Please enter a valid binary number.");
        }
    }

    public static int convertBinaryToDecimal(String binary) throws WrongNumberFormatException {
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
                throw new WrongNumberFormatException("Invalid binary number format");
            }
        }
        
        return Integer.parseInt(binary, 2);
    }
}

class WrongNumberFormatException extends Exception {
    public WrongNumberFormatException(String message) {
        super(message);
    }
}
