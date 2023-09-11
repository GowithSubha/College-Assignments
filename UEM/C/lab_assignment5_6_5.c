// Write a C program to find LCM of two numbers.
#include<stdio.h>
int main()
{
    int n1, n2, lcm;
    printf("Enter the first number: ");
    scanf("%d", &n1);
    printf("Enter the second number: ");
    scanf("%d", &n2);
    for (int i = 1; i <= n1 * n2; i++)
    {
        if (i % n1 == 0 && i % n2 == 0)
        {
            lcm = i;
            break;
        }
    }
    printf("The LCM of %d and %d is %d\n", n1, n2, lcm);
    return 0;
}
