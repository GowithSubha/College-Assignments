import java.util.Scanner;
public class Q_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int nonZeroCount = countNonZeroElements(array);
        System.out.println("The number of non-zero elements in the array is: " + nonZeroCount);
        scanner.close();
    }
    public static int countNonZeroElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }
}
