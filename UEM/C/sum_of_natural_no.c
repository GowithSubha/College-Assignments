// Write a c program to calculate the sum of first n natural number.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num, sum = 0;
    printf("Enter the number to calculate the sum of first n natural number\n");
    scanf("%d", &num);
    for (int i = 1; i <= num; i++)
    {
        sum = sum + i;
    }
    printf("The sum of first %d natural number is %d\n", num, sum);
    return 0;
}
