// Write a program that reads a 2D metrics and checks if the metrics is a symmetric metrics or not
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int i, j, row, col, flag = 0;
    printf("Enter the number of rows and columns of the metrics\n");
    scanf("%d %d", &row, &col);
    int arr[row][col];
    printf("Enter the elements of the metrics\n");
    for ( i = 0; i < row; i++)
    {
        for ( j = 0; j < col; j++)
        {
            scanf("%d", &arr[i][j]);
        }
        
    }
    printf("The elements of the metrics are:\n");
    for ( i = 0; i < row; i++)
    {
        for ( j = 0; j < col; j++)
        {
           printf("%.4d ", arr[i][j]);
        }
        printf("\n");
    }
    for ( i = 0; i < row; i++)
    {
        for ( j = 0; j < col; j++)
        {
           if (arr[i][j] != arr[j][i])
           {
               flag = 1;
               break;
           }
           
        }
        
    }
    if (flag == 1)
    {
        printf("The metrics is not symmetric\n");
    }
    else
    {
        printf("The metrics is symmetric\n");
    }
    
    return 0;
}