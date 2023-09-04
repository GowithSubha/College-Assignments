// Convert string to number.
#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    int i, n, len;
    printf("Enter a string: ");
    gets(str);
    len = strlen(str);
    n = 0;
    for (i = 0; i < len; i++)
    {
        n = n * 10 + (str[i] - '0');
    }
    printf("\nNumber = %d", n);
    return 0;
}