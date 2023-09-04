// Write a c program to calculate the factorial of a number.
#include <stdio.h>
int main(int argc, char const *argv[])
{   
    int num, fact=1;
    printf("Enter the number to find the factorial of \n");
    scanf("%d", &num);
    for (int i = 1; i <= num; i++)
    {
        fact = fact * i;
    }
    printf("The factorial of %d is %d\n", num, fact);
    return 0;
}
