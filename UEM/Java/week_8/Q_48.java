package week_8;

import java.util.Scanner;

//48. Write a Java Program to Ask the User His Name and Greets Him With His Name.
public class Q_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Hello, " + name + "!");
    }
}
