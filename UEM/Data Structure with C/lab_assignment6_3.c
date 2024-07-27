// Write a program to convert an infix expression into its equivalent postfix notation.

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

// define a function to return the precedence of an operator
int precedence(char x)
{
    if (x == '(')             // if the operator is an opening parenthesis
        return 0;             // return the lowest precedence
    if (x == '+' || x == '-') // if the operator is + or -
        return 1;             // return the second lowest precedence
    if (x == '*' || x == '/') // if the operator is * or /
        return 2;             // return the second highest precedence
    return 0;                 // return the lowest precedence by default
}

// define the main function
int main()
{
    char exp[100]; // declare an array to store the infix expression
    char *e, x;    // declare two pointers to scan the expression and store the popped element
    printf("Enter the infix expression: ");
    scanf("%s", exp); // read the infix expression from the user
    printf("\n");
    e = exp; // initialize e to point to the first character of the expression
    while (*e != '\0')
    {                          // repeat until the end of the expression is reached
        if (isalnum(*e))       // if the scanned character is an operand (a digit or a letter)
            printf("%c ", *e); // print it to the output
        else if (*e == '(')    // if the scanned character is an opening parenthesis
            push(*e);          // push it to the stack
        else if (*e == ')')
        {                              // if the scanned character is a closing parenthesis
            while ((x = pop()) != '(') // pop the stack until an opening parenthesis is encountered
                printf("%c ", x);      // print the popped elements to the output
        }
        else
        {                                                    // if the scanned character is an operator
            while (precedence(stack[top]) >= precedence(*e)) // while the precedence of the top of the stack is greater than or equal to the precedence of the scanned operator
                printf("%c ", pop());                        // pop the stack and print the popped element to the output
            push(*e);                                        // push the scanned operator to the stack
        }
        e++; // increment e to point to the next character of the expression
    }
    while (top != -1)
    {                         // while the stack is not empty
        printf("%c ", pop()); // pop the stack and print the popped element to the output
    }
    return 0; // return 0 to indicate successful termination
}
