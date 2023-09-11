/*C program to print following Pyramid:
    0
   01
  010
 0101
01010
*/

#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number of rows: ");
    scanf("%d", &n);
    for (int i = n; i >= 1; i--)
    {
        for (int j = 1; j <= i - 1; j++)
        {
            printf(" ");
        }
        for (int k = 1; k <= n - i + 1; k++)
        {
            if (k % 2 == 0)
            {
                printf("1");
            }
            else
            {
                printf("0");
            }
        }
        printf("\n");
    }
    return 0;
}