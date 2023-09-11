// Write a C program to check whether a number is Armstrong number or not .
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int n, temp, sum = 0, remainder;
    printf("Enter the number: ");
    scanf("%d", &n);
    temp = n;
    while (temp != 0)
    {
        remainder = temp % 10;
        sum += remainder * remainder * remainder;
        temp /= 10;
    }
    if (sum == n)
    {
        printf("%d is an Armstrong number\n", n);
    }
    else
    {
        printf("%d is not an Armstrong number\n", n);
    }
    return 0;
}
