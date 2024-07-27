import java.util.*;
import copyright.copyright;

public class swap {
    public static void main(String[] args) {
        copyright.main(args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }
    
}
