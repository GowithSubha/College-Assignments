// class Counting {
//     private int count = 0;

//     public void increment() {
//         synchronized (this) {
//             count++;
//         }
//     }

//     public int getCount() {
//         return count;
//     }
// }

// public class Q4 {
//     public static void main(String[] args) {
//         Counting counting = new Counting();
//         Thread t1 = new Thread(new Runnable() {
//             public void run() {
//                 for (int i = 100; i < 104; i++) {
//                     counting.increment();
//                     System.out.println(i);
//                 }
//                 System.out.println("\n\n");
//             }
//         });

//         Thread t2 = new Thread(new Runnable() {
//             public void run() {
//                 for (int i = 200; i < 204; i++) {
//                     counting.increment();
//                     System.out.println(i);
//                 }
//                 System.out.println("\n");
//             }
//         });

//         t1.start();
//         t2.start();

//         try {
//             t1.join();
//             t2.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Count is : " + counting.getCount());
//     }
// }

class Counting {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("A thread was interrupted while sleeping.");
            }
        }
    }

    public int getCount() {
        return count;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Counting counting = new Counting();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 100; i < 104; i++) {
                    counting.increment();
                    System.out.println(i);
                }
                System.out.println("\n\n");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 200; i < 204; i++) {
                    counting.increment();
                    System.out.println(i);
                }
                System.out.println("\n");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for threads to complete.");
        }

        System.out.println("Count is : " + counting.getCount());
    }
}
