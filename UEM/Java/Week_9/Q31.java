public class Q31 {
    public static void main(String[] args) {
        Q31Thread q31_1 = new Q31Thread();
        Q31Thread q31_2 = new Q31Thread();
        q31_1.start();
        q31_2.start();
    }
}

class Q31Thread extends Thread {
    public void run() {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
    }
}