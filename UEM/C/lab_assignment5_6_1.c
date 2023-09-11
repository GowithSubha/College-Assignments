// Write a C program to find power of a number using for loop.
#include<stdio.h>
int main()
{
    int base, exponent, result = 1;
    printf("Enter the base: ");
    scanf("%d", &base);
    printf("Enter the exponent: ");
    scanf("%d", &exponent);
    for (int i = 0; i < exponent; i++)
    {
        result = result * base;
    }
    printf("%d^%d = %d\n", base, exponent, result);
    return 0;
}