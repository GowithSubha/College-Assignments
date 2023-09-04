// Write a program to check whether its alphabet, digit or special character.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    char ch;
    printf("Enter the character to check whether its alphabet, digit or special character\n");
    scanf("%c", &ch);
    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
    {
        printf("The character is alphabet\n");
    }
    else if (ch >= '0' && ch <= '9')
    {
        printf("The character is digit\n");
    }
    else
    {
        printf("The character is special character\n");
    }
    return 0;
}
