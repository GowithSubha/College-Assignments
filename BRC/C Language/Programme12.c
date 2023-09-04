// Write a program to take a number and check if the number is triple digit same number or not.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int number;
    printf("Enter the number \n");
    scanf("%d", &number);
    printf("Your entered number: %d\n", number);
    if (number>= 100 && number <1000)
    {
        if (number%111 == 0)
        {
            printf("Your entered number is a triple digit same number.\n");
        }
        
    }

    else
    {
        printf("Your entered number is not a triple digit.\n");
    }
    
    
    return 0;
}
