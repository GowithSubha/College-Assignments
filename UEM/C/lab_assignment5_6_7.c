// Write a C program to print all Prime numbers between 1 to n.
#include<stdio.h>
int main()
{
    int n, flag;
    printf("Enter the number: ");
    scanf("%d", &n);
    printf("The prime numbers between 1 to %d are: ", n);
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
            printf("%d ", i);
        }
    }
    printf("\n");
    return 0;
}