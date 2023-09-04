// Write a program to take 2 number and calculate the sum and multiplication of those 2 numbers.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int a, b, c, d;
    printf("Enter first number: \n");
    scanf("%d", &a);
    printf("Enter second number: \n");
    scanf("%d", &b);
    c=a+b;
    d=a*b;
    printf("The sum of the two numbers= %d and \nThe multiplication of the two numbers= %d \n",c ,d);
    return 0;
}
