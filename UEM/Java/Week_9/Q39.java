// public class Q39 {
//     public static void main(String[] args) {
//         Thread thread = new Thread(() -> {
//             System.out.println("Thread is running...");
//             try {
//                 Thread.sleep(1000); // Simulating some work
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("Thread resumed after suspension.");
//         });

//         thread.start();

//         // Suspend the thread for 3 seconds using suspend() method
//         thread.suspend();
//         System.out.println("Thread suspended.");

//         try {
//             Thread.sleep(3000); // Wait for 3 seconds
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         // Resume the suspended thread using resume() method
//         thread.resume();
//     }
// }

public class Q39 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                // Suspend the thread for 3 seconds
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread resumed after suspension.");
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
