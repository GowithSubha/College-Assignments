public class Q6 {
    public static void main(String[] args) {
        int bufferSize = 4; // Set the buffer size
        Buffer buffer = new Buffer(bufferSize); // Create a buffer with the specified size

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}

// Buffer class representing the shared buffer
class Buffer {
    private final int[] buffer;
    private int size;
    private int in; // Index for adding items to the buffer
    private int out; // Index for removing items from the buffer

    public Buffer(int capacity) {
        this.buffer = new int[capacity];
        this.size = 0;
        this.in = 0;
        this.out = 0;
    }

    // Method to add an item to the buffer (producer)
    public synchronized void produce(int item) throws InterruptedException {
        while (size == buffer.length) {
            // Buffer is full, wait for consumer to consume items
            wait();
        }
        buffer[in] = item;
        in = (in + 1) % buffer.length;
        size++;
        System.out.println("Produced: " + item);
        notify(); // Notify consumer that an item is available
    }

    // Method to remove an item from the buffer (consumer)
    public synchronized int consume() throws InterruptedException {
        while (size == 0) {
            // Buffer is empty, wait for producer to produce items
            wait();
        }
        int item = buffer[out];
        out = (out + 1) % buffer.length;
        size--;
        System.out.println("Consumed: " + item);
        notify(); // Notify producer that space is available in buffer
        return item;
    }
}

// Producer class representing the producer thread
class Producer implements Runnable {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i); // Produce items 1 to 10
                Thread.sleep(1000); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Consumer class representing the consumer thread
class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume(); // Consume items from the buffer
                Thread.sleep(2000); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
