// reverse the array
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
    printf("The reverse of the array is:\n");
    for ( i = num-1; i >= 0; i--)
    {
        printf("%d \n", arr[i]);
    }
    return 0;
}