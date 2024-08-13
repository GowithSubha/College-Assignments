public class StackExample {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            // This will throw PushException as the stack is full
            stack.push(6);
        } catch (PushException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Pop all elements to demonstrate PopException
            for (int i = 0; i < 6; i++) {
                stack.pop();
            }
        } catch (PopException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) throws PushException {
        if (top == maxSize - 1) {
            throw new PushException("Push operation failed: Stack is full.");
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public int pop() throws PopException {
        if (top == -1) {
            throw new PopException("Pop operation failed: Stack is empty.");
        }
        int value = stackArray[top--];
        System.out.println("Popped: " + value);
        return value;
    }
}

class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}
