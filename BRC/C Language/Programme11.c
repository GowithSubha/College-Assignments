// Write a program to calculate the grade of a student whose 5 marks are given by the user. (Grades: above 90 Grade O, above 80 E, above 70 A, above 60 B, above 50 C, above 40 D, below 40 F)
#include <stdio.h>
int main(int argc, char const *argv[])
{
    float M1, M2, M3, M4, M5, average;
    printf("Enter marks of your 1st subject: \n");
    scanf("%f", &M1);
    printf("Enter marks of your 2nd subject: \n");
    scanf("%f", &M2);
    printf("Enter marks of your 3rd subject: \n");
    scanf("%f", &M3);
    printf("Enter marks of your 4th subject: \n");
    scanf("%f", &M4);
    printf("Enter marks of your 5th subject: \n");
    scanf("%f", &M5);

    average =(M1 + M2 + M3 + M4 + M5)/5;
    printf("Average %f\n", average);

    if (average >= 90)
    {
        printf("Your grade= O\n");
    }
    else if (average >= 80)
    {
        printf("Your grade= E\n");    
    }
    else if (average >= 70)
    {
        printf("Your grade= A\n");
    }
    else if (average >= 60)
    {
        printf("Your grade= B\n");
    }
    else if (average >= 50)  
    {
        printf("Your grade= C\n");
    }  
    else if (average >= 40)
    {
        printf("Your grade= D\n");
    }
    else
    {
        printf("Fail \nTry to be better on next time :): \n");
    }
        
    return 0;
}
