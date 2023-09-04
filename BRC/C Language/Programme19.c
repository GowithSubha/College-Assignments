// Write a program to take a number and calculate the factorial of that number.

#include<stdio.h>
int main(int argc, char const *argv[])
{
    int c, num1, f=1;
    printf("Enter a number to calculate its factorial \t");
    scanf("%d", &num1);
        for(c=1;c<=num1;c++)
            {
                f=f*c;
            }
            printf("The factorial is %d",f);
    return 0;
}