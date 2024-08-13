import java.util.Scanner;
public class Q_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        int[] sumArray = addArraysIndexWise(array1, array2);
        System.out.println("Resultant array after adding index-wise:");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
    public static int[] addArraysIndexWise(int[] array1, int[] array2) {
        int size = array1.length;
        int[] sumArray = new int[size];
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        return sumArray;
    }
}
