// Convert number to string.
#include<stdio.h>
int main()
{
    char result[50];
    float num;
    printf("Enter a number: ");
    scanf("%f", &num);
    sprintf(result, "%f", num);
    printf("\n The string for the num is %s", result);
    getchar();
}