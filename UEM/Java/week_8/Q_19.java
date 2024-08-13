package week_8;


//19. Write a Java Program to Replace a Substring Inside a String by Another One.
import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the String want to remove: ");
        String oldSubString = sc.nextLine();
        System.out.print("Enter the String want to replace with: ");
        String newSubString = sc.nextLine();
        if (!str.contains(oldSubString)) {
            System.out.println(oldSubString + " is not Present in the given String -> " + str);
            return;
        }
        str = str.replace(oldSubString, newSubString);
        System.out.println("String After replacement is: " + str);
    }
}
/*
Output:
Enter a String: Java Program is very lovely.
Enter the String want to remove: Java
Enter the String want to replace with: Python
String After replacement is: Python Program is very lovely.
 */
