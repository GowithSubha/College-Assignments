#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define MAX_SIZE 100

// Structure for the stack
struct Stack
{
    int top;
    int items[MAX_SIZE];
};

// Function to initialize the stack
void initialize(struct Stack *stack)
{
    stack->top = -1;
}

// Function to check if the stack is empty
int isEmpty(struct Stack *stack)
{
    return stack->top == -1;
}

// Function to push an element onto the stack
void push(struct Stack *stack, int value)
{
    if (stack->top == MAX_SIZE - 1)
    {
        printf("Stack Overflow\n");
        exit(EXIT_FAILURE);
    }
    stack->items[++stack->top] = value;
}

// Function to pop an element from the stack
int pop(struct Stack *stack)
{
    if (isEmpty(stack))
    {
        printf("Stack Underflow\n");
        exit(EXIT_FAILURE);
    }
    return stack->items[stack->top--];
}

// Function to evaluate a postfix expression
int evaluatePostfix(char postfix[])
{
    struct Stack stack;
    initialize(&stack);

    for (int i = 0; postfix[i] != '\0'; i++)
    {
        char symbol = postfix[i];
        if (isdigit(symbol))
        {
            // Operand: push onto the stack
            push(&stack, symbol - '0');
        }
        else
        {
            // Operator: pop operands, perform operation, and push result
            int operand2 = pop(&stack);
            int operand1 = pop(&stack);

            switch (symbol)
            {
            case '+':
                push(&stack, operand1 + operand2);
                break;
            case '-':
                push(&stack, operand1 - operand2);
                break;
            case '*':
                push(&stack, operand1 * operand2);
                break;
            case '/':
                push(&stack, operand1 / operand2);
                break;
            default:
                printf("Invalid Operator\n");
                exit(EXIT_FAILURE);
            }
        }
    }

    // The final result is on the top of the stack
    return pop(&stack);
}

int main()
{
    char postfix[] = "10 7 5 - 10 + 2 / +";
    int result = evaluatePostfix(postfix);

    printf("Result of the postfix expression: %d\n", result);

    return 0;
}
