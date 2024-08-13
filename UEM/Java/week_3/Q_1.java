import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / size;
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
        scanner.close();
    }
}