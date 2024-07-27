import java.util.*;
import copyright.copyright;
public class temperatureConverter {
    public static void main(String[] args) {
        copyright.main(args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                double c = sc.nextDouble();
                double f = (c * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + f);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                double f1 = sc.nextDouble();
                double c1 = (f1 - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + c1);
                break;
            default:
                System.out.println("Invalid choice");
        }

        
    }
}
