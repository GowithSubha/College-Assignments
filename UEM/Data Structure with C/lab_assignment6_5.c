// Write a program to evaluate a postfix expression.

#include <stdio.h>
#include <ctype.h>

char stack[100]; // declare a global stack array
int top = -1;    // declare a global top variable

// define a function to push an element into the stack
void push(char x)
{
    stack[++top] = x;
}

// define a function to pop an element from the stack
char pop()
{
    if (top == -1) // if the stack is empty
        return -1; // return -1 as an error code
    else
        return stack[top--]; // return the top element and decrement the top
}

// define a function to evaluate an operator on two operands
int evaluate(char x, int op1, int op2)
{
    if (x == '+')         // if the operator is +
        return op1 + op2; // return the sum of the operands
    if (x == '-')         // if the operator is -
        return op1 - op2; // return the difference of the operands
    if (x == '*')         // if the operator is *
        return op1 * op2; // return the product of the operands
    if (x == '/')         // if the operator is /
        return op1 / op2; // return the quotient of the operands
    return 0;             // return 0 by default
}

// define the main function
int main()
{
    char exp[100];       // declare an array to store the postfix expression
    char *e;             // declare a pointer to scan the expression
    int n1, n2, n3, num; // declare four variables to store the operands and the result
    printf("Enter the postfix expression: ");
    scanf("%s", exp); // read the postfix expression from the user
    printf("\n");
    e = exp; // initialize e to point to the first character of the expression
    while (*e != '\0')
    { // repeat until the end of the expression is reached
        if (isdigit(*e))
        {                  // if the scanned character is a digit
            num = *e - 48; // convert the character to an integer
            push(num);     // push the integer to the stack
        }
        else
        {                              // if the scanned character is an operator
            n1 = pop();                // pop the first operand from the stack
            n2 = pop();                // pop the second operand from the stack
            n3 = evaluate(*e, n2, n1); // evaluate the operator on the operands
            push(n3);                  // push the result to the stack
        }
        e++; // increment e to point to the next character of the expression
    }
    printf("The result of the expression %s is %d\n", exp, pop()); // print the final result from the stack
    return 0;                                                      // return 0 to indicate successful termination
}
