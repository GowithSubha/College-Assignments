// Write a c program to swap the first and last digit of a number.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num, first, last, swap, count=0, temp;
    printf("Enter the number to swap the first and last digit of a number\n");
    scanf("%d", &num);
    temp = num;
    last = num % 10;
    while (num >= 10)
    {
        num = num / 10;
        count++;
    }
    first = num;
    swap = last;
    for (int i = 1; i <= count; i++)
    {
        swap = swap * 10;
    }
    swap = swap + temp % swap;
    swap = swap - last;
    swap = swap + first;
    printf("The number after swapping the first and last digit is %d\n", swap);
    return 0;
}