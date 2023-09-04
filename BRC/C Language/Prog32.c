// Implement the following string functions: strlen(), strcmp(), strcat(); strrev();
#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100], str2[100];
    int i, j;
    printf("Enter the string 1: ");
    gets(str1);
    printf("Enter the string 2: ");
    gets(str2);

    printf("\nString 1: %s", str1);
    printf("\nString 2: %s", str2);

    printf("\n********* Implement strlen() *********\n");

    printf("\nLength of string 1: %d", strlen(str1));

    printf("\n********* Implement strcmp() *********\n");

    printf("\nCompare string 1 and string 2: %d", strcmp(str1, str2));
    if (strcmp(str1, str2) == 0)
        printf("\nStrings are equal");
    else
        printf("\nStrings are not equal");

    printf("\n********* Implement strcat() *********\n");

    printf("\nConcatenate string 1 and string 2: %s", strcat(str1, str2));

    printf("\n********* Implement strrev() *********\n");

    printf("\nReverse string 1: %s", strrev(str1));

    return 0;
}