package week_8;

//13. Write a Java Program to Use EqualsIgnoreCase Method In a String Class.
public class Q_13 {
    public static void main(String[] args) {
        String str_1 = "JAVA Program";
        String str_2 = "Java Program";

        if (str_1.equalsIgnoreCase(str_2))
            System.out.println("String-1 and String-2 are equal..");
        else System.out.println("String-1 and String-2 are not equal.");
    }
}
/*
Output:
String-1 and String-2 are equal.
*/
