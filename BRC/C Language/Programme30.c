// Write a programme to calculate the factorial of a given number using function:-
#include <stdio.h>
int Factorial(int);
int main(int argc, char const *argv[])
{
    int num1, b;
    printf("Enter a number to calculate its factorial:\t");
    scanf("%d", &num1);
    b = Factorial(num1);
    printf("The factorial is %d", b);
    return 0;
}
int Factorial(int num1)
{
    int i,  f=1;
    for (i = 1; i <= num1; i++)
    {
        f = f*i;
    }
    return f;
    
}
