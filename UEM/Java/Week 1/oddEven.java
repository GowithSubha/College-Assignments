import java.util.*;
import copyright.copyright;
public class oddEven {
    public static void main(String[] args) {
        copyright.main(args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }
    
}
