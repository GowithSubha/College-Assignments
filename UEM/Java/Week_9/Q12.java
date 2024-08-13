class MyThreadClass implements Runnable {

    public void run() {
        int count = 0;
        int i = 5;
        while (i > 0) {
            i--;
            count++;
        }
        System.out.println("Final Count : " + count);
    }
}

public class Q12 {
    public static void main(String[] args) {
        MyThreadClass mtc = new MyThreadClass();
        Thread t1 = new Thread(mtc);
        t1.start();
    }
}
