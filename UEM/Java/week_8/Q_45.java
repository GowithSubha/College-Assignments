package week_8;

import java.util.Scanner;
import java.util.regex.Pattern;

//45. Write a Java Program to Validate an Email Address Format.
public class Q_45 {
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty())
            return false;
        // Another patter ->
        //String email_pattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        String email_pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(email_pattern);
        return pattern.matcher(email).matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Email to check: ");
        String email = sc.nextLine();
        if (isValidEmail(email))
            System.out.println("The email " + email + " is a valid email.");
        else
            System.out.println("The email " + email + " is not a valid email.");
    }
}
