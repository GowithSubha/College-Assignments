package week_8;

//9. Write a Java Program to Remove the White Spaces from a String.
import java.util.Scanner;
public class Q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String noSpaceStr = str.replaceAll("\\s", "");
        System.out.println(noSpaceStr);
    }
}
