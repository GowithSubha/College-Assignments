// Write a c program to print the integer number from 1 to 10.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num = 1;
    while (num <= 10)
    {
        printf("%d\n", num);
        num++;
    }
    return 0;
}