// Write a program to take a character and check the character is vowel or consonent.

#include <stdio.h>
int main(int argc, char const *argv[])
{
    char ch;
	printf("Enter your alphabet \t");
	scanf("%c",&ch);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
        printf("%c is a vowel",ch);
    }
	
	else
    {
        printf("%c is a consonant",ch);
    }
	
    return 0;
}
// #include <stdio.h>
// int main() {
//     char c;
//     int lowercase_vowel, uppercase_vowel;
//     printf("Enter an alphabet: ");
//     scanf("%c", &c);

//     // evaluates to 1 if variable c is a lowercase vowel
//     lowercase_vowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

//     // evaluates to 1 if variable c is a uppercase vowel
//     uppercase_vowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

//     // evaluates to 1 (true) if c is a vowel
//     if (lowercase_vowel || uppercase_vowel)
//         printf("%c is a vowel.", c);
//     else
//         printf("%c is a consonant.", c);
//     return 0;
// }