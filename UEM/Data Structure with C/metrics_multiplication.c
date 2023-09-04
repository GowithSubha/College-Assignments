// Write a program that reads two 2D metrices from the console, verifies if metrics multiplication is possible or not .Then multiplies the metrices and prints the 3rd metrics.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int i, j, k, row1, col1, row2, col2, sum = 0;
    printf("Enter the number of rows and columns of the first metrics\n");
    scanf("%d %d", &row1, &col1);
    printf("Enter the number of rows and columns of the second metrics\n");
    scanf("%d %d", &row2, &col2);
    int arr1[row1][col1], arr2[row2][col2], arr3[row1][col2];
    if (col1 == row2)
    {
        printf("Enter the elements of the first metrics\n");
        for (i = 0; i < row1; i++)
        {
            for (j = 0; j < col1; j++)
            {
                scanf("%d", &arr1[i][j]);
            }
        }
        printf("The elements of the first metrics are:\n");
        for (i = 0; i < row1; i++)
        {
            for (j = 0; j < col1; j++)
            {
                printf("%4d ", arr1[i][j]);
            }
            printf("\n");
        }
        printf("Enter the elements of the second metrics\n");
        for (i = 0; i < row2; i++)
        {
            for (j = 0; j < col2; j++)
            {
                scanf("%d", &arr2[i][j]);
            }
        }
        printf("The elements of the second metrics are:\n");
        for (i = 0; i < row2; i++)
        {
            for (j = 0; j < col2; j++)
            {
                printf("%4d ", arr2[i][j]);
            }
            printf("\n");
        }
        for (i = 0; i < row1; i++)
        {
            for (j = 0; j < col2; j++)
            {
                for (k = 0; k < row2; k++)
                {
                    sum = sum + arr1[i][k] * arr2[k][j];
                }
                arr3[i][j] = sum;
                sum = 0;
            }
        }
        printf("The elements of the third metrics are:\n");
        for (i = 0; i < row1; i++)
        {
            for (j = 0; j < col2; j++)
            {
                printf("%4d ", arr3[i][j]);
            }
            printf("\n");
        }
    }
    else
    {
        printf("The metrics multiplication is not possible\n");
    }
    return 0;
}