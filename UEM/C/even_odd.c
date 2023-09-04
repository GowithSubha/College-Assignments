// Write a c program to check the whether the number is even or odd.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num;
    printf("Enter the number to check the whether the number is even or odd\n");
    scanf("%d", &num);
    if (num % 2 == 0)
    {
        printf("The number is even\n");
    }
    else
    {
        printf("The number is odd\n");
    }
    return 0;
}
