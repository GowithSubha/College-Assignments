import java.util.Scanner;
public class Q_10 {
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
        int smallest = findSmallestNumber(array);
        System.out.println("The smallest number in the array is: " + smallest);
        scanner.close();
    }
    public static int findSmallestNumber(int[] array) {
        if (array.length == 0) {
            // Handle the case when the array is empty
            return Integer.MIN_VALUE; 
        }
        int smallest = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
