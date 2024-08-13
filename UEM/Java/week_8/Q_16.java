package week_8;

//16. Write a Java Program to Replace Character or String.
import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the Character or String You want to replace: ");
        String str_replace = sc.nextLine();
        System.out.print("Enter the new String or Character: ");
        String str_new = sc.nextLine();

        if (str.contains(str_replace))
            System.out.println("New String is : " + str.replace(str_replace, str_new));
        else System.out.println("The given string is not present in the 1st String.");
    }
}
