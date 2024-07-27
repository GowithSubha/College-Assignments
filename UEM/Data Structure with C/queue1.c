#include <stdio.h>
#include <stdbool.h>

#define MAX_SIZE 10

// Function to display the elements of the circular queue
void displayQueue(char queue[], int front, int rear)
{
    printf("| ");
    for (int i = 0; i < MAX_SIZE; i++)
    {
        if (i >= front && i <= rear)
        {
            printf("%c | ", queue[i]);
        }
        else
        {
            printf("  | ");
        }
    }
    printf("\n");
}

// Function to add an element to the circular queue
void enqueue(char queue[], char element, int *rear)
{
    *rear = (*rear + 1) % MAX_SIZE;
    queue[*rear] = element;
    printf("Added %c to the queue.\n", element);
}

// Function to delete elements from the circular queue
void dequeue(char queue[], int count, int *front, int *rear)
{
    if (*front == -1 || *rear == -1)
    {
        printf("Queue is empty. Cannot delete.\n");
    }
    else
    {
        for (int i = 0; i < count; i++)
        {
            queue[*front] = ' ';
            *front = (*front + 1) % MAX_SIZE;
            if (*front == (*rear + 1) % MAX_SIZE)
            {
                // If front becomes equal to rear, set front and rear to -1
                *front = -1;
                *rear = -1;
            }
        }
        printf("Deleted %d element(s) from the queue.\n", count);
    }
}

int main()
{
    char queue[MAX_SIZE] = {' ', 'A', 'B', 'C', 'D', 'E', ' ', ' ', ' ', ' '};
    int front = 1, rear = 5;

    displayQueue(queue, front, rear);

    // a. Add F
    enqueue(queue, 'F', &rear);
    displayQueue(queue, front, rear);

    // b. Delete two letters
    dequeue(queue, 2, &front, &rear);
    displayQueue(queue, front, rear);

    // c. Add G
    enqueue(queue, 'G', &rear);
    displayQueue(queue, front, rear);

    // d. Add H
    enqueue(queue, 'H', &rear);
    displayQueue(queue, front, rear);

    // e. Delete four letters
    dequeue(queue, 4, &front, &rear);
    displayQueue(queue, front, rear);

    // f. Add I
    enqueue(queue, 'I', &rear);
    displayQueue(queue, front, rear);

    return 0;
}

// Output
// |   | A | B | C | D | E |   |   |   |   |
// Added F to the queue.
// |   | A | B | C | D | E | F |   |   |   |
// Deleted 2 element(s) from the queue.
// |   |   |   | C | D | E | F |   |   |   |
// Added G to the queue.
// |   |   |   | C | D | E | F | G |   |   |
// Added H to the queue.
// |   |   |   | C | D | E | F | G | H |   | 
// Deleted 4 element(s) from the queue.
// |   |   |   |   |   |   |   | G | H |   |
// Added I to the queue.
// |   |   |   |   |   |   |   | G | H | I |