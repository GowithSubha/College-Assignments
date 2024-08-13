package week_8;
//5. Write a Java Program to Concatenate Two Strings.

import java.util.Scanner;

class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String str_1 = sc.nextLine();
        System.out.println("Enter 2nd String:");
        String str_2 = sc.nextLine();
        System.out.println("Concatenated String is :" + str_1.concat(str_2));
    }
}
//Output:
//Enter 1st String:
//Hello
//Enter 2nd String:
//Hii
//Concatenated String is :HelloHii