// Write a C program to print all Armstrong numbers between 1 to n.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int n, temp, sum = 0, remainder;
    printf("Enter the number: ");
    scanf("%d", &n);
    printf("The Armstrong numbers between 1 to %d are: ", n);
    for (int i = 1; i <= n; i++)
    {
        temp = i;
        sum = 0;
        while (temp != 0)
        {
            remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp /= 10;
        }
        if (sum == i)
        {
            printf("%d ", i);
        }
    }
    printf("\n");
    
    return 0;
}
