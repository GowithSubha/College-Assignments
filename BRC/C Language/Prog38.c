// Find GCD of two numbers. (Using Recursion)
#include <stdio.h>
int GCD_Rec(int num1, int num2);
int main()
{
    int num1, num2;
    printf("Enter 1st number \n");
    scanf("%d", &num1);
    printf("Enter 2nd numbers \n");
    scanf("%d", &num2);

    printf("GCD of two numbers %d and %d is %d", num1, num2, GCD_Rec(num1, num2));
    return 0;
}

int GCD_Rec(int num1, int num2)
{
    if (num2 != 0)
    {
        return GCD_Rec(num2, num1 % num2);
    }
    else
    {
        return num1;
    }
}

