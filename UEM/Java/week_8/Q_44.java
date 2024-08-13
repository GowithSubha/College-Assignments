package week_8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//44. Write a Java Program to Check Whether Date is in Proper Format or Not.
public class Q_44 {
    public static boolean isValidDateFormat(String dateString, String format) {
        try {
            LocalDate.parse(dateString, DateTimeFormatter.ofPattern(format));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Date (MM/DD/YYYY) or (YYYY-MM-DD) format: ");
        String date = sc.nextLine();
        String format_1 = "MM/dd/yyyy";
        String format_2 = "yyyy-MM-dd";

        if (isValidDateFormat(date, format_1) || isValidDateFormat(date, format_2))
            System.out.println("The Date " + date + " is in Proper format.");
        else
            System.out.println("The Date " + date + " is not in Proper format.");
    }
}
