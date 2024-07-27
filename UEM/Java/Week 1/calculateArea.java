import java.util.*;
import copyright.copyright;

public class calculateArea {
    public static void main(String[] args) {
        copyright.main(args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Area and parameter of Circle");
        System.out.println("2. Area and parameter of Rectangle");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter radius of the circle: ");
                double r = sc.nextDouble();
                double area = 3.14 * r * r;
                double parameter = 2 * 3.14 * r;
                System.out.println("Area of the circle: " + area);
                System.out.println("Parameter of the circle: " + parameter);
                break;
            case 2:
                System.out.println("Enter length and breadth of the rectangle: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double area1 = l * b;
                double parameter1 = 2 * (l + b);
                System.out.println("Area of the rectangle: " + area1);
                System.out.println("Parameter of the rectangle: " + parameter1);
                break;
            default:
                System.out.println("Invalid choice");
    } 
}
    
}
