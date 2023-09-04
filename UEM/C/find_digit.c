// Write a c program to find the first and last digit of a number.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num, first, last;
    printf("Enter the number to find the first and last digit of a number\n");
    scanf("%d", &num);
    last = num % 10;
    while (num >= 10)
    {
        num = num / 10;
    }
    first = num;
    printf("The first digit of the number is %d\n", first);
    printf("The last digit of the number is %d\n", last);
    
    return 0;
}
