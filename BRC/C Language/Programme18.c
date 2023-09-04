// Write a program to take a number and calculate the sum of digit of a number.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num1,s=0;
    printf("Enter a number \t");
    scanf("%d", &num1);
    while (num1>0)
    {
        int p;
        p=num1%10;
        s=s+p;
        num1=num1/10;
    }
    printf("The sum is %d" ,s);
    return 0;
}
