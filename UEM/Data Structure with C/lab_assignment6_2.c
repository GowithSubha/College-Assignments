/*
Write a Menu driven C program to accomplish the following functionalities in Stack using Linked List:
a. Insert an element into the stack using a Linked List (Push Operation).
b. Delete an element from the stack using a Linked List (Pop Operation).
c. Return the value of the topmost element of the stack (without deleting it from the stack) using a Linked List.
d. Display the elements of the stack using a Linked List.
*/

#include <stdio.h>
#include <stdlib.h>

// Define stack node structure
struct node
{
    int data;          // Data to store in the node
    struct node *next; // Pointer to the next node
};

// Declare a global pointer to the top of the stack
struct node *top = NULL;

// Function prototypes
void push(int x); // Push an element into the stack
int pop();        // Pop an element from the stack
int peek();       // Return the top element of the stack
void display();   // Display the stack elements

int main()
{
    int choice, data;

    while (1)
    {
        // Menu
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("Enter the data to push: ");
            scanf("%d", &data);
            push(data); // Call the push function
            break;
        case 2:
            data = pop(); // Call the pop function
            if (data != -1)
                printf("The popped data is %d\n", data);
            break;
        case 3:
            data = peek(); // Call the peek function
            if (data != -1)
                printf("The top element is %d\n", data);
            break;
        case 4:
            display(); // Call the display function
            break;
        case 5:
            exit(0); // Exit the program
        default:
            printf("Invalid choice\n");
        }
    }

    return 0;
}

// Function to push an element into the stack
void push(int x)
{
    // Create a new node and allocate memory for it
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    if (newNode == NULL) // Check for memory allocation failure
    {
        printf("Stack overflow\n");
        return;
    }

    // Store the data and the pointer to the next node
    newNode->data = x;
    newNode->next = top;

    // Update the top pointer
    top = newNode;
    printf("%d pushed into the stack\n", x);
}

// Function to pop an element from the stack
int pop()
{
    // Check for empty stack
    if (top == NULL)
    {
        printf("Stack underflow\n");
        return -1;
    }

    // Store the top node and its data
    struct node *temp = top;
    int x = temp->data;

    // Update the top pointer and free the memory
    top = top->next;
    free(temp);

    // Return the popped element
    return x;
}

// Function to return the top element of the stack
int peek()
{
    // Check for empty stack
    if (top == NULL)
    {
        printf("Stack is empty\n");
        return -1;
    }

    // Return the top element
    return top->data;
}

// Function to display the stack elements
void display()
{
    // Check for empty stack
    if (top == NULL)
    {
        printf("Stack is empty\n");
        return;
    }

    // Declare a pointer to traverse the stack
    struct node *ptr = top;

    // Print the stack elements
    printf("The stack elements are:\n");
    while (ptr != NULL)
    {
        printf("\t%d\n", ptr->data);
        ptr = ptr->next;
    }
}
