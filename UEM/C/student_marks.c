// if the marks obtained by a student in five different subjects are input through the keyboard, find out the aggregate marks and percentage marks obtained by the student. Assume that the maximum marks that can be obtained by a student in each subject is 100.
#include<stdio.h>
int main(int argc, char const *argv[])
{
    int arr[5], i, sum=0;
    float per;
    printf("Enter the marks of the student in five different subjects\n");
    for ( i = 0; i < 5; i++)
    {
        printf("Enter the marks of subject: %d\t", i+1);
        scanf("%d", &arr[i]);
    }
    for ( i = 0; i < 5; i++)
    {
        sum = sum + arr[i];
    }
    per = sum/5;
    printf("The aggregate marks obtained by the student is %d\n", sum);
    printf("The percentage marks obtained by the student is %f\n", per);
    return 0;
}
