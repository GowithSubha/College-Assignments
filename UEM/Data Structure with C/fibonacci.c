// To print the fibonacci series, we need to know the first two numbers of the series.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num, i, first = 0, second = 1, next;
    printf("Enter the number of elements of fibonacci series\n");
    scanf("%d", &num);
    printf("The fibonacci series is:\n");
    for ( i = 0; i < num; i++)
    {
        if (i <= 1)
        {
            next = i;
        }
        else
        {
            next = first + second;
            first = second;
            second = next;
        }
        printf("%d \n", next);
    }
    return 0;
}
