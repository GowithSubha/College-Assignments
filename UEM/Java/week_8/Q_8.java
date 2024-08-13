package week_8;

//8. Write a Java Program to Find All Possible Subsets of given Length in String.
import java.util.Scanner;
public class Q_8 {
    static void subset(String str, String curr, int i, int str_len, int len) {
        if (curr.length() == len) {
            System.out.println(curr);
            return;
        }
        if (i == str_len)
            return;

        subset(str, curr + str.charAt(i), i + 1, str_len, len);
        subset(str, curr, i + 1, str_len, len);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the length of the substring: ");
        int len = sc.nextInt();
        subset(str, "", 0, str.length(), len);
    }
}
//Output:
//Enter a String: ABCD
//Enter the length of the substring: 2
//AB
//AC
//AD
//BC
//BD
//CD

