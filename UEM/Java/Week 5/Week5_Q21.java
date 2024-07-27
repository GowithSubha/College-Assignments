//Write program, which finds the sum of numbers formed by consecutive digits.
//  Input : 2415 
// output : 24+41+15=80.
import java.util.Scanner;

public class Week5_Q21 {
    void sumConsicutive(int num) {
        int sum = 0, temp = num, rem = 0;
        while (temp > 0) {
            rem = temp % 100;
            sum += rem;
            temp = temp / 10;
        }
        sum -= rem;
        System.out.println("Sum of numbers formed by consecutive 2 digits: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Week5_Q21 obj = new Week5_Q21();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        obj.sumConsicutive(num);
    }
}
