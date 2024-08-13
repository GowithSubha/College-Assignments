import java.util.Scanner;

public class BinaryDecimalConverter {
    
    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
    
    // Function to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        if (decimal == 0) {
            binary.append(0);
        } else {
            while (decimal > 0) {
                binary.insert(0, decimal % 2);
                decimal /= 2;
            }
        }
        return binary.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();
        int decimalValue = binaryToDecimal(binaryInput);
        System.out.println("Decimal equivalent: " + decimalValue);
        
        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalInput = scanner.nextInt();
        String binaryValue = decimalToBinary(decimalInput);
        System.out.println("Binary equivalent: " + binaryValue);
        
        scanner.close();
    }
}
//output
//Enter a binary number: 101
//Decimal equivalent: 5
//Enter a decimal number: 98
//Binary equivalent: 1100010
