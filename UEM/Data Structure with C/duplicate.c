// Write a C program to check duplicate number in an array.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int i, j, num, flag = 0;
    printf("Enter the number of elements of arrays\n");
    scanf("%d", &num);
    printf("Enter the elements of the array \n");
    int arr[num];
    for ( i = 0; i < num; i++)
    {
        scanf("%d", &arr[i]);   
    }
    printf("The elements are:\n");
    for ( i = 0; i < num; i++)
    {
        printf("%d \n", arr[i]);
    }
    for ( i = 0; i < num; i++)
    {
        for ( j = i+1; j < num; j++)
        {
            if (arr[i] == arr[j])
            {
                flag = 1;
                break;
            }
        }
        
    }
    if (flag = 1)
    {
        printf("Duplicate number found\n");
    }
    else
    {
        printf("Duplicate number not found\n");
    }
    return 0;
}