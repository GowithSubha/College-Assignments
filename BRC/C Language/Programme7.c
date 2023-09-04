// Write a program to calculate the maximum among 3 numbers using conditional operator.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int a, b, c, d;
    printf("Enter the 1st number \n");
    scanf("%d", &a);
    printf("Enter the 1st number \n");
    scanf("%d", &b);
    printf("Enter the 1st number \n");
    scanf("%d", &c);

    d=(a>b)?((a>c)?a:c):((b>c)?b:c);
    printf("\n%d is maximum", d);
    
    return 0;
}
