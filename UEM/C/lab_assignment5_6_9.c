// Write a C program to find all prime factors of a number.
#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d", &n);
    printf("The prime factors of %d are: ", n);
    for (int i = 2; i <= n; i++)
    {
        if (n % i == 0)
        {
            int flag = 0;
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
    }
    printf("\n");
    return 0;
}