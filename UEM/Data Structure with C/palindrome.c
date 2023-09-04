// check if the string is palindrome or not
#include<stdio.h>
#include<string.h>
int main(int argc, char const *argv[])
{
    char str[100];
    int i, len, flag = 0;
    printf("Enter the string\n");
    scanf("%s", str);
    len = strlen(str);
    for ( i = 0; i < len; i++)
    {
        if (str[i] != str[len - i - 1])
        {
            flag = 1;
            break;
        }
    }
    if (flag == 1)
    {
        printf("The string is not palindrome\n");
    }
    else
    {
        printf("The string is palindrome\n");
    }
    return 0;
}