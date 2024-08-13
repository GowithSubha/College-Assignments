// Define an interface with a method to be implemented by a thread class
interface RunnableTask {
    void runTask();
}

// Create a class that extends Thread and implements the interface
class CustomThread extends Thread implements RunnableTask {

    @Override
    public void runTask() {
        System.out.println("CustomThread is running");
    }

    @Override
    public void run() {
        runTask(); // Call the interface method from the run method of Thread
    }
}

public class Q32 {
    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start(); // Start the thread
    }
}
