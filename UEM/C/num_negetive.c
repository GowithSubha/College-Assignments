// Write a c program to display a number if it is negative.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num;
    printf("Enter the number to display a number if it is negative\n");
    scanf("%d", &num);
    if (num < 0)
    {
        printf("The number is negative\n");
    }
    return 0;
}
