import java.util.Scanner;
public class Q_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions of the arrays:");
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Number of columns: ");
        int cols = scanner.nextInt();
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        System.out.println("Enter elements of first array:");
        inputArrayElements(scanner, array1);
        System.out.println("Enter elements of second array:");
        inputArrayElements(scanner, array2);
        int[][] sumArray = new int[rows][cols];
        calculateSum(array1, array2, sumArray);
        System.out.println("Sum of the two arrays:");
        displayArray(sumArray);
        scanner.close();
    }
    public static void inputArrayElements(Scanner scanner, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    public static void calculateSum(int[][] array1, int[][] array2, int[][] sumArray) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
    }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
