// 20. Write a program to accept value of apple sales for each day of the week
// (using array of type float) and then, calculate the average sale of the week.

import java.util.Scanner;

public class Week5_Q20 {
    float avg(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        float[] nums = new float[7];
        Week5_Q20 obj = new Week5_Q20();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": ");
            nums[i] = sc.nextFloat();
        }
        System.out.println("The average sale of week: " + obj.avg(nums));
    }
}
