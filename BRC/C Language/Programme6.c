// Write a program to take 2 numbers and check 2 numbers are equal or maximum.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int a,b;
    printf("Enter 1st number: \n");
    scanf("%d",&a);
    printf("Enter 2nd number: \n");
    scanf("%d",&b);

    if (a == b)
    {
        printf("Your entered numbers are equal \n");
    }

    else if (a > b)
    {
        printf("%d is Maximum \n", a);
    }

    else
    {
        printf("%d is Maximum \n", b);
    }
    
    
    
    return 0;
}
