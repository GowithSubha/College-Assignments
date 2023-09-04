// Write a program to take a number from the user and check if the number is even or odd.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int number;
    printf("Enter your number \t");
    scanf("%d", &number);
    printf("You entered %d \n", number);
    if (number%2==0)
    {
        printf("%d is a even number", number);
    }
    else
    {
        printf("%d is a odd number", number);
    }
    return 0;
}
