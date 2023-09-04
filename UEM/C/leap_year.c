// Write a program to check the year is leap year or not.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int year;
    printf("Enter the year to check the year is leap year or not\n");
    scanf("%d", &year);
    if (year % 4 == 0 && year % 100 != 0)
    {̥
        printf("The year is leap year\n");
    }
    else if (year % 400 == 0)
    {
        printf("The year is leap year\n");
    }
    else
    {
        printf("The year is not leap year\n");
    }
    return 0;
}