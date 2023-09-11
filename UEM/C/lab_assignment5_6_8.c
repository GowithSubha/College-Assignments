// Write a C program to find sum of all prime numbers between 1 to n.
#include<stdio.h>
int main()
{
    int n, flag, sum = 0;
    printf("Enter the number: ");
    scanf("%d", &n);
    printf("The sum of prime numbers between 1 to %d are: ", n);
    for (int i = 2; i <= n; i++)
    {
        flag = 0;
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            sum += i;
        }
    }
    printf("%d\n", sum);
    return 0;
}