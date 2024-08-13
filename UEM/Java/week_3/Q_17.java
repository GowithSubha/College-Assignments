import java.util.Scanner;
public class Q_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        float[] array1 = new float[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextFloat();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        float[] array2 = new float[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextFloat();
        }
        float[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged array:");
        for (float num : mergedArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static float[] mergeArrays(float[] array1, float[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        float[] mergedArray = new float[size1 + size2];
        // Copy elements of the first array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }
        return mergedArray;
    }
}
