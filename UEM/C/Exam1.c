// Draw the queue structure in each case when the following operations are performed on an
// empty queue.
// a. Add A, B, C, D, E, F
// b. Delete two letters
// c. Add G
// d. Add H
// e. Delete four letters
// f. Add I

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 10

struct CircularQueue
{
    char items[MAX_SIZE];
    int front;
    int rear;
    int size;
};

// Function prototypes
void initializeCircularQueue(struct CircularQueue *queue);
void insertCircularQueue(struct CircularQueue *queue, char item);
char deleteCircularQueue(struct CircularQueue *queue);
void displayCircularQueue(struct CircularQueue *queue);

int main()
{
    struct CircularQueue myQueue;
    initializeCircularQueue(&myQueue);

    // a. Add A, B, C, D, E, F
    insertCircularQueue(&myQueue, 'A');
    insertCircularQueue(&myQueue, 'B');
    insertCircularQueue(&myQueue, 'C');
    insertCircularQueue(&myQueue, 'D');
    insertCircularQueue(&myQueue, 'E');
    insertCircularQueue(&myQueue, 'F');

    // Display the queue after adding A, B, C, D, E, F
    displayCircularQueue(&myQueue);

    // b. Delete two letters
    deleteCircularQueue(&myQueue);
    deleteCircularQueue(&myQueue);

    // Display the queue after deleting two letters
    displayCircularQueue(&myQueue);

    // c. Add G
    insertCircularQueue(&myQueue, 'G');

    // Display the queue after adding G
    displayCircularQueue(&myQueue);

    // d. Add H
    insertCircularQueue(&myQueue, 'H');

    // Display the queue after adding H
    displayCircularQueue(&myQueue);

    // e. Delete four letters
    deleteCircularQueue(&myQueue);
    deleteCircularQueue(&myQueue);
    deleteCircularQueue(&myQueue);
    deleteCircularQueue(&myQueue);

    // Display the queue after deleting four letters
    displayCircularQueue(&myQueue);

    // f. Add I
    insertCircularQueue(&myQueue, 'I');

    // Display the final state of the queue
    displayCircularQueue(&myQueue);

    return 0;
}

void initializeCircularQueue(struct CircularQueue *queue)
{
    queue->front = -1;
    queue->rear = -1;
    queue->size = 0;
}

void insertCircularQueue(struct CircularQueue *queue, char item)
{
    if ((queue->rear + 1) % MAX_SIZE == queue->front)
    {
        printf("Queue is full. Cannot insert.\n");
    }
    else
    {
        queue->rear = (queue->rear + 1) % MAX_SIZE;
        queue->items[queue->rear] = item;
        if (queue->front == -1)
        {
            queue->front = 0;
        }
        queue->size++;
    }
}

char deleteCircularQueue(struct CircularQueue *queue)
{
    char removedItem = '\0'; // Assuming '\0' is not a valid item in the queue
    if (queue->front == -1)
    {
        printf("Queue is empty. Cannot delete.\n");
    }
    else
    {
        removedItem = queue->items[queue->front];
        if (queue->front == queue->rear)
        {
            // Last element is being deleted
            initializeCircularQueue(queue);
        }
        else
        {
            queue->front = (queue->front + 1) % MAX_SIZE;
        }
        queue->size--;
    }
    return removedItem;
}

void displayCircularQueue(struct CircularQueue *queue)
{
    if (queue->front == -1)
    {
        printf("Queue is empty.\n");
    }
    else
    {
        int current = queue->front;
        do
        {
            printf("%c ", queue->items[current]);
            current = (current + 1) % MAX_SIZE;
        } while (current != (queue->rear + 1) % MAX_SIZE);
        printf("\n");
    }
}
