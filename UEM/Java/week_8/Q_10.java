package week_8;

//10. Write a Java Program to Compare two Strings.
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str_1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str_2 = sc.nextLine();
        System.out.println("Result of Comparison is: " + str_1.equals(str_2));
    }
}
