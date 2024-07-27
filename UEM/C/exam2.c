#include <stdio.h>
#include <stdlib.h>

#define MAXSIZE 10

struct Stack
{
    int items[MAXSIZE];
    int top;
};

// Function to initialize a stack
void initializeStack(struct Stack *stack)
{
    stack->top = -1;
}

// Function to check if the stack is empty
int isEmpty(struct Stack *stack)
{
    return stack->top == -1;
}

// Function to push an element onto the stack
void push(struct Stack *stack, int element)
{
    if (stack->top == MAXSIZE - 1)
    {
        printf("Stack overflow! Cannot push element.\n");
        return;
    }

    stack->items[++stack->top] = element;
}

// Function to pop an element from the stack
int pop(struct Stack *stack)
{
    if (isEmpty(stack))
    {
        printf("Stack underflow! Cannot pop from an empty stack.\n");
        return -1; // Return a sentinel value indicating an error
    }

    return stack->items[stack->top--];
}

// Function to copy the contents of one stack to another
void copyStack(struct Stack *source, struct Stack *destination)
{
    // Clear the destination stack
    initializeStack(destination);

    // Temporary stack to preserve the order
    struct Stack tempStack;
    initializeStack(&tempStack);

    // Copy elements from source to tempStack
    while (!isEmpty(source))
    {
        push(&tempStack, pop(source));
    }

    // Copy elements from tempStack to destination
    while (!isEmpty(&tempStack))
    {
        push(destination, pop(&tempStack));
    }
}

int main()
{
    // Create two stacks
    struct Stack stack1, stack2;
    initializeStack(&stack1);
    initializeStack(&stack2);

    // Push some elements onto stack1
    push(&stack1, 1);
    push(&stack1, 2);
    push(&stack1, 3);
    push(&stack1, 4);

    // Copy contents of stack1 to stack2
    copyStack(&stack1, &stack2);

    // Display the contents of stack2
    printf("Contents of stack2: ");
    while (!isEmpty(&stack2))
    {
        printf("%d ", pop(&stack2));
    }

    return 0;
}
