package week_8;

//18. Write a Java Program to Remove a Particular Character from a String.
import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the Character want to remove: ");
        char rc = sc.next().charAt(0);
        if (str.indexOf(rc) == -1) {
            System.out.println(rc + " is not Present in the given String " + str);
            return;
        }
        str = str.replace(rc + "", "");
        System.out.println("String After removing the Character " + rc + "is :" + str);
    }
}
