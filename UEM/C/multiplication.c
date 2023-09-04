// Write the c program to print the multiplication table of a given number.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int num, i = 1;
    printf("Enter the number to print the multiplication table of a given number\n");
    scanf("%d", &num);
    while (i <= 10)
    {
        printf("%d * %d \t= %d\n", num, i, num * i);
        i++;
    }
    return 0;
}