import java.util.Scanner;
public class Q_8 {
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
        int sum = sumOfDiagonalElements(array);
        System.out.println("Sum of diagonal elements in the array: " + sum);
        scanner.close();
    }
    public static int sumOfDiagonalElements(int[][] array) {
        int sum = 0;
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows && i < cols; i++) {
            sum += array[i][i]; 
        }
        return sum;
    }
}
