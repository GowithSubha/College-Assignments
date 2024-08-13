import java.util.Scanner;
public class Q_15 {
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
        int secondHighest = findSecondHighest(array);
        if (secondHighest != Integer.MIN_VALUE) {
            System.out.println("The second highest element in the array is: " + secondHighest);
        } else {
            System.out.println("The second highest element does not exist in the array.");
        }
        scanner.close();
    }
    public static int findSecondHighest(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE;
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return secondMax;
    }
}
