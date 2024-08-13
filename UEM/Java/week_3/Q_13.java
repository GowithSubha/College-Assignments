import java.util.Scanner;
public class Q_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isSparse = isSparseMatrix(matrix);
        if (isSparse) {
            System.out.println("The given matrix is sparse.");
        } else {
            System.out.println("The given matrix is not sparse.");
        }

        scanner.close();
    }
    public static boolean isSparseMatrix(int[][] matrix) {
        int zeroCount = 0;
        int totalElements = matrix.length * matrix[0].length;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == 0) {
                    zeroCount++;
                }
            }
        }
        return zeroCount > (totalElements / 2);
    }
}

