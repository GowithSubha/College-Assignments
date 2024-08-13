import java.util.Scanner;
public class Q_3 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;
    public Q_3(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
        System.out.println(value + " enqueued to queue");
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        System.out.println(value + " dequeued from queue");
        return value;
    }
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    public boolean isFull() {
        return (currentSize == maxSize);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        Q_3 queue = new Q_3(size);
        System.out.println("Queue operations:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Exit");
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
        scanner.close();
    }
}
