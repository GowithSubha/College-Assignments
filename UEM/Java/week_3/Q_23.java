import java.util.Scanner;
public class Q_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array A: ");
        int sizeA = scanner.nextInt();
        int[] A = new int[sizeA];
        System.out.println("Enter elements of array A in ascending order:");
        for (int i = 0; i < sizeA; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of array B: ");
        int sizeB = scanner.nextInt();
        int[] B = new int[sizeB];
        System.out.println("Enter elements of array B in ascending order:");
        for (int i = 0; i < sizeB; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }
        int[] C = mergeSortedArrays(A, B);
        System.out.println("Merged array C:");
        for (int num : C) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int sizeA = A.length;
        int sizeB = B.length;
        int sizeC = sizeA + sizeB;
        int[] C = new int[sizeC];
        int i = 0, j = 0, k = 0;
        while (i < sizeA && j < sizeB) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < sizeA) {
            C[k++] = A[i++];
        }
        while (j < sizeB) {
            C[k++] = B[j++];
        }
        return C;
    }
}
