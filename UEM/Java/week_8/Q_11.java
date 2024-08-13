package week_8;

public class Q_11 {
    public static void main(String[] args) {
        String str1 = "This is a string for comparison";
        String str2 = "This is another string for comparison";

        long startTime, endTime;

        // Compare using == (checks reference equality - fastest)
        startTime = System.nanoTime();
        boolean isEqualRef = str1 == str2;
        endTime = System.nanoTime();
        System.out.println("Time taken for == (reference): " + (endTime - startTime) + " ns");

        // Compare using equals() (checks content equality)
        startTime = System.nanoTime();
        boolean isEqualContent = str1.equals(str2);
        endTime = System.nanoTime();
        System.out.println("Time taken for equals(): " + (endTime - startTime) + " ns");

        // Compare using equalsIgnoreCase() (checks content equality ignoring case)
        startTime = System.nanoTime();
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        endTime = System.nanoTime();
        System.out.println("Time taken for equalsIgnoreCase(): " + (endTime - startTime) + " ns");
    }
}
//Output:
//Time taken for == (reference): 599 ns
//Time taken for equals(): 18500 ns
//Time taken for equalsIgnoreCase(): 18899 ns