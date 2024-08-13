import java.util.Scanner;
public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = sumOfOddNumbers(array);
        System.out.println("Sum of odd numbers in the array: " + sum);
        scanner.close();
    }
    public static int sumOfOddNumbers(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                if (num % 2 != 0) {
                    sum += num;
                }
            }
        }
        return sum;
    }
}