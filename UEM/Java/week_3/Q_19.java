import java.util.Scanner;
public class Q_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int cols1 = scanner.nextInt();
        System.out.print("Enter the number of rows of the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int cols2 = scanner.nextInt();
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            scanner.close();
            return;
        }
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] resultMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
}
