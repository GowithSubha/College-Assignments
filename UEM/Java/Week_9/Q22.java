public class Q22 {
    public static void main(String[] args) {
        System.out.println("Main starts...");
        exitMethod();
        System.out.println("This line will not be printed.");
    }

    public static void exitMethod() {
        System.out.println("exitMethod() starts...");
        System.exit(0);
        System.out.println("exitMethod() finishes!");
    }
}
