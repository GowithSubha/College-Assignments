// Write a c program to find prime numbers between 1 to n.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num, i, j, flag;
    printf("Enter the number to find the prime numbers between 1 to n\n");
    scanf("%d", &num);
    printf("The prime numbers between 1 to %d are:\n", num);
    for (i = 2; i <= num; i++)
    {
        flag = 0;
        for (j = 2; j <= i / 2; j++)
        {
            if (i % j == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0 && i != 1)
        {
            printf("%d\n", i);
        }
    }
    return 0;
}
