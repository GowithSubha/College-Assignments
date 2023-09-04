// Write a program to check whethet the character is vowel or consonant.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    char ch;
    printf("Enter the character to check whethet the character is vowel or consonant\n");
    scanf("%c", &ch);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
    {
        printf("The character is vowel\n");
    }
    else
    {
        printf("The character is consonant\n");
    }
    return 0;
}