// Write a program that reads ten numbers, computes their average, and finds out
// how many numbers are above the average.
import java.util.Scanner;

public class Week5_Q16 {
    int count = 0;

    float avg(int[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    int countMaxElem(int[] arr, int avg) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Week5_Q16 obj = new Week5_Q16();
        System.out.println("Average: " + obj.avg(arr));
        System.out.println("Number of elements above average: " + obj.countMaxElem(arr, (int) (obj.avg(arr))));
    }
}
