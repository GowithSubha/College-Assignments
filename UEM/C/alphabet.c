// Write a c program to check the whether a character is alphabet or not.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    char ch;
    printf("Enter the character to check the whether a character is alphabet or not\n");
    scanf("%c", &ch);
    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
    {
        printf("The character is alphabet\n");
    }
    else
    {
        printf("The character is not alphabet\n");
    }
    return 0;
}