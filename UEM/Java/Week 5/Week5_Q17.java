// 17. Write a program that reads ten integers and displays them in the reverse
// of the order in which they were read.
import java.util.Scanner;

public class Week5_Q17 {
    void displayReverse(int[] arr) {
        System.out.print("Reversed: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Week5_Q17 obj = new Week5_Q17();
        obj.displayReverse(arr);
    }
}
