// Write a program to swap 2 numbers using 3 different methods.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int a, b, c;
    int x;
    printf("\n=====================Swapping two numbers.==================\n");
    printf("-----------------------------MENU------------------------- \n \n");
    printf("Press 0 ==> Swap two numbers using third variable\n");
    printf("Press 1 ==> Swap two numbers without using third variable\n");
    printf("Press 2 ==> Swap two numbers using xor operation\n");
    printf("Press 3 ==> Exit\n");

    printf("Press your choice ==> ");
    scanf("%d", &x);

    if (x == 0)
    {
        printf("You choose ==> Swap two numbers using third variable\n");
        printf("Enter 1st number- \n");
        scanf("%d", &a);
        printf("Enter 2nd number- \n");
        scanf("%d", &b);
        c = a;
        a = b;
        b = c;
        printf("After swaping the 1st no. = %.2d and \nThe 2nd no. = %.2d \n", a, b);
    }

    else if (x == 1)
    {
        printf("You choose ==> Swap two numbers without using third variable\n");
        printf("Enter 1st number- \n");
        scanf("%d", &a);
        printf("Enter 2nd number- \n");
        scanf("%d", &b);
        a = a + b;
        b = a - b;
        a = a - b;
        printf("After swaping the 1st no. = %.2d and \nThe 2nd no. = %.2d \n", a, b);
    }

    else if (x == 2)
    {
        printf("You choose ==> Swap two numbers using xor operation\n");
        printf("Enter 1st number- \n");
        scanf("%d", &a);
        printf("Enter 2nd number- \n");
        scanf("%d", &b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        printf("After swaping the 1st no. = %.2d and \nThe 2nd no. = %.2d \n", a, b);
    }

    else if (x == 3)
    {
        printf("You choose ==> Exit\n");
        printf("Thank you for using this program.\n");
    }

    else
    {
        printf("You choose ==> Invalid choice\n");
        printf("Thank you for using this program.\n");
    }

    return 0;
}
