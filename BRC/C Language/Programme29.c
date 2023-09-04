// print the pattern
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int i, d;
    for (i = 1; i <= 5; i++)
    {
        for (d = 1; d <= i; d++)
        {
            printf("* ");
        }
        printf("\n");
    }
    for (i = 1; i <= 4; i++)
    {
        for (d = 4; d >= i; d--)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}

