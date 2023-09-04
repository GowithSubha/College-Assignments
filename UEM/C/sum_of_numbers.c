// Write the c program to add numbers until the user enters zero.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num, sum = 0;
    printf("Enter the number to add numbers until the user enters zero\n");
    scanf("%d", &num);
    while (num != 0)
    {
        sum += num;
        printf("Enter the number to add numbers until the user enters zero\n");
        scanf("%d", &num);
    }
    printf("The sum of the numbers is %d\n", sum);
    return 0;
}