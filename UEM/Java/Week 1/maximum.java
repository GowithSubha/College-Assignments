import java.util.*;
import copyright.copyright;
public class maximum {
    public static void main(String[] args) {
        copyright.main(args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the maximum number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the maximum number");
        } else {
            System.out.println(c + " is the maximum number");
        }
    }
}
