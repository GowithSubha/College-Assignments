// Write a C program to count how many 1’s are there from 1 to 100.
#include <stdio.h>
int main()
{
    int i, n, j, count = 0;
    for (i = 1; i <= 100; i++)
    {
        for (j = i; j > 0; j = j / 10)
        {
            n = j % 10;
            if (n == 1)
            {
                count++;
            }
        }
    }
    printf("The total number of 1 between 1 to 100 is : %d \n", count);
    return 0;
}
