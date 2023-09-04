// write the c program to find the frequency of each digit in a number.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num, count[10]={0}, temp;
    printf("Enter the number to find the frequency of each digit in a number\n");
    scanf("%d", &num);
    temp = num;
    while (num > 0)
    {
        count[num % 10]++;
        num = num / 10;
    }
    printf("The frequency of each digit in %d is:\n", temp);
    for (int i = 0; i < 10; i++)
    {
        printf("The frequency of %d is %d\n", i, count[i]);
    }
    return 0;
}