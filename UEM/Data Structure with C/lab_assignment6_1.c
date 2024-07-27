/*
1) Write a Menu driven C program to accomplish the following functionalities in Stack using an Array:
a. Insert an element into the stack using an array (Push Operation).
b. Delete an element from the stack using an array (Pop Operation).
c. Return the value of the topmost element of the stack (without deleting it from the stack) using an array.
d. Display the elements of a stack using an array.
*/

#include <stdio.h>
#include <stdlib.h>

#define MAX 10 // Maximum size of the stack

int stack[MAX]; // Array to store the stack elements
int top = -1;   // Index of the top element

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
    if (top == MAX - 1) // Check for stack overflow
    {
        printf("Stack overflow\n");
        return;
    }

    top++;          // Increment the top index
    stack[top] = x; // Store the element in the array
    printf("%d pushed into the stack\n", x);
}

// Function to pop an element from the stack
int pop()
{
    if (top == -1) // Check for stack underflow
    {
        printf("Stack underflow\n");
        return -1;
    }

    int x = stack[top]; // Store the top element
    top--;              // Decrement the top index
    return x;           // Return the popped element
}

// Function to return the top element of the stack
int peek()
{
    if (top == -1) // Check for empty stack
    {
        printf("Stack is empty\n");
        return -1;
    }

    return stack[top]; // Return the top element
}

// Function to display the stack elements
void display()
{
    if (top == -1) // Check for empty stack
    {
        printf("Stack is empty\n");
        return;
    }

    printf("The stack elements are:\n");
    for (int i = top; i >= 0; i--) // Loop from top to bottom
    {
        printf("\t%d\n", stack[i]); // Print the element
    }
}
