import java.util.Scanner;
public class Q_22 {
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
        System.out.println("Every alternate number of the array:");
        for (int i = 0; i < size; i += 2) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
