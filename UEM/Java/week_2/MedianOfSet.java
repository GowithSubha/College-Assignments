import java.util.Arrays;
import java.util.Scanner;

public class MedianOfSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Read the elements into an array
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Find the median
        double median = findMedian(nums);

        System.out.println("The median is: " + median);

        scanner.close();
    }

    // Function to find the median of an array of numbers
    public static double findMedian(int[] nums) {
        Arrays.sort(nums); // Sort the array

        int n = nums.length;

        // If the number of elements is odd, return the middle element
        if (n % 2 != 0) {
            return nums[n / 2];
        } else { // If the number of elements is even, return the average of the two middle elements
            int mid1 = nums[n / 2 - 1];
            int mid2 = nums[n / 2];
            return (double) (mid1 + mid2) / 2;
        }
    }
}
// output
//Enter the number of elements: 5
//Enter the elements:
//10
//20
//30
//40
//50
//The median is: 30.0
