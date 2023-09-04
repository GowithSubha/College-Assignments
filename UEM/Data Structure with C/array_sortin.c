// to sort an array in ascending order
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int num, i, j, temp;
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
    // sorting the array
    for ( i = 0; i < num; i++)
    {
        for ( j = i+1; j < num; j++)
        {
            if (arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j]; 
                arr[j] = temp;
            }
        }
    }
    printf("The sorted array is:\n");
    for ( i = 0; i < num; i++)
    {
        printf("%d \n", arr[i]);
    }
    return 0;
}
