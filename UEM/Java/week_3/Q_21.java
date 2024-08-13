import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q_21 {
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
        Map<Integer, Integer> frequencyMap = findDuplicateElements(array);
        System.out.println("Duplicate elements and their frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
        scanner.close();
    }
    public static Map<Integer, Integer> findDuplicateElements(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        frequencyMap.entrySet().removeIf(entry -> entry.getValue() == 1);
        return frequencyMap;
    }
}
