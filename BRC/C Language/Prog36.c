// Find whether a given string is palindrome or not.
#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    int i, j, len, flag = 0;
    printf("Enter a string: ");
    gets(str);
    len = strlen(str);
    for (i = 0, j = len - 1; i < j; i++, j--)
    {
        if (str[i] != str[j])
        {
            flag = 1;
            return 0;
        }
    }
    if (flag == 0)
        printf("%s is palindrome.", str);
    else
        printf("%s String is not palindrome.", str);
    return 0;
}