public class AllCombination {

    public static void main(String[] args) {
        generateCombinations();
    }

    public static void generateCombinations() {
        int[] numbers = { 1, 2, 3 };

        System.out.println("All combinations of 1, 2, or 3:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    System.out.print(numbers[i] + " ");
                    System.out.print(numbers[j] + " ");
                    System.out.println(numbers[k]);
                }
            }
        }
    }
}
// output
// All combinations of 1, 2, or 3:
// 1 1 1
// 1 1 2
// 1 1 3
// 1 2 1
// 1 2 2
// 1 2 3
// 1 3 1
// 1 3 2
// 1 3 3
// 2 1 1
// 2 1 2
// 2 1 3
// 2 2 1
// 2 2 2
// 2 2 3
// 2 3 1
// 2 3 2
// 2 3 3
// 3 1 1
// 3 1 2
// 3 1 3
// 3 2 1
// 3 3 3