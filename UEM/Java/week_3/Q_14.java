import java.util.Scanner;
public class Q_14 {
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
        int primeCount = countPrimeNumbers(array);
        System.out.println("The number of prime numbers in the array is: " + primeCount);
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}