// count number of words in a string.
#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    int i, j, count = 0;
    printf("Enter a string: ");
    gets(str);
    for (i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == ' ')
        {
            count++;
        }
    }
    printf("Number of words in the string: %d", count + 1);
    return 0;
}