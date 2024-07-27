// Write a program to print the Fibonacci series using recursion.

#include <stdio.h>

// define a function to return the nth Fibonacci number
int fibonacci(int n)
{
    if (n == 0 || n == 1)                           // base case
        return n;                                   // return 0 or 1
    else                                            // recursive case
        return fibonacci(n - 1) + fibonacci(n - 2); // return the sum of the previous two Fibonacci numbers
}

// define the main function
int main()
{
    int num; // declare a variable to store the number of terms
    printf("Enter the number of terms: ");
    scanf("%d", &num); // read the number of terms from the user
    printf("The Fibonacci series is:\n");
    for (int i = 0; i < num; i++)
    {                                // loop from 0 to num - 1
        printf("%d ", fibonacci(i)); // print the ith Fibonacci number
    }
    printf("\n");
    return 0; // return 0 to indicate successful termination
}
