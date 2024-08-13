package week_8;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        scanner.close();
        StringBuilder revStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) 
            revStr.append(str.charAt(i));
        
        System.out.println("Reversed String is: " + revStr);
    }
}
//Output:
//Enter a String:
//JAVA program
//Reversed String is: margorp AVAJ