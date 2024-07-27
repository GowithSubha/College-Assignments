// Write a program to convert an infix expression into its equivalent prefix notation.

#include <stdio.h>
#include <string.h>
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
    if (x == '^')             // if the operator is ^
        return 3;             // return the highest precedence
    return 0;                 // return the lowest precedence by default
}

// define a function to reverse a string
void reverse(char *s)
{
    int i = 0;             // declare a variable to store the starting index
    int j = strlen(s) - 1; // declare a variable to store the ending index
    char temp;             // declare a variable to store the temporary character
    while (i < j)
    {                // repeat until the middle of the string is reached
        temp = s[i]; // store the ith character in temp
        s[i] = s[j]; // swap the ith and jth characters
        s[j] = temp; // swap the jth and temp characters
        i++;         // increment i
        j--;         // decrement j
    }
}

// define a function to convert an infix expression to a prefix expression
void infixToPrefix(char *infix, char *prefix)
{
    int i = 0;      // declare a variable to store the current index of the infix expression
    int j = 0;      // declare a variable to store the current index of the prefix expression
    char x;         // declare a variable to store the popped element
    reverse(infix); // reverse the infix expression
    while (infix[i] != '\0')
    {                               // repeat until the end of the infix expression is reached
        if (isalnum(infix[i]))      // if the scanned character is an operand (a digit or a letter)
            prefix[j++] = infix[i]; // copy it to the prefix expression
        else if (infix[i] == ')')   // if the scanned character is a closing parenthesis
            push(infix[i]);         // push it to the stack
        else if (infix[i] == '(')
        {                              // if the scanned character is an opening parenthesis
            while ((x = pop()) != ')') // pop the stack until a closing parenthesis is encountered
                prefix[j++] = x;       // copy the popped elements to the prefix expression
        }
        else
        {                                                         // if the scanned character is an operator
            while (precedence(infix[i]) < precedence(stack[top])) // while the precedence of the scanned operator is less than the precedence of the top of the stack
                prefix[j++] = pop();                              // pop the stack and copy the popped element to the prefix expression
            push(infix[i]);                                       // push the scanned operator to the stack
        }
        i++; // increment i
    }
    while (top != -1)
    {                        // while the stack is not empty
        prefix[j++] = pop(); // pop the stack and copy the popped element to the prefix expression
    }
    prefix[j] = '\0'; // append a null character to the end of the prefix expression
    reverse(prefix);  // reverse the prefix expression
}

// define the main function
int main()
{
    char infix[100];  // declare an array to store the infix expression
    char prefix[100]; // declare an array to store the prefix expression
    printf("Enter the infix expression: ");
    scanf("%s", infix); // read the infix expression from the user
    printf("\n");
    infixToPrefix(infix, prefix);                     // call the function to convert the infix expression to the prefix expression
    printf("The prefix expression is: %s\n", prefix); // print the prefix expression to the output
    return 0;                                         // return 0 to indicate successful termination
}
