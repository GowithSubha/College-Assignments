/*C program to print following Pyramid:
    1
   123
  12345
 1234567
123456789
*/

#include <stdio.h>

int main()
{
    int n; // Number of rows in the pyramid
    printf("Enter the number of rows: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        // Print spaces before numbers
        for (int j = 1; j <= n - i; j++)
        {
            printf(" ");
        }

        // Print numbers in ascending order
        for (int j = 1; j <= 2 * i - 1; j++)
        {
            printf("%d", j);
        }

        // Move to the next line after each row
        printf("\n");
    }

    return 0;
}
