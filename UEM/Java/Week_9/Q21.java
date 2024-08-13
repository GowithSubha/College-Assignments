public class Q21 {
    static {
        System.out.println(" -> Inside static block");
    }

    public static void main(String[] args) {
        System.out.println(" <- Inside main method");
        Q21 q21 = new Q21();
    }
}
