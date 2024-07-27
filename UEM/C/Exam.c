#include <stdio.h>

#define MAX_SIZE 10

void matrixSum(int A[MAX_SIZE][MAX_SIZE], int B[MAX_SIZE][MAX_SIZE], int result[MAX_SIZE][MAX_SIZE], int n, int X, int Y);

int main()
{
    int n, X, Y;

    // Input matrix size and constants X, Y
    printf("Enter the size of square matrices A and B (n): ");
    scanf("%d", &n);
    printf("Enter constants X and Y: ");
    scanf("%d %d", &X, &Y);

    int A[MAX_SIZE][MAX_SIZE], B[MAX_SIZE][MAX_SIZE], result[MAX_SIZE][MAX_SIZE];

    // Input matrices A and B
    printf("Enter elements of matrix A:\n");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &A[i][j]);

    printf("Enter elements of matrix B:\n");
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            scanf("%d", &B[i][j]);

    // Calculate XA + YB
    matrixSum(A, B, result, n, X, Y);

    // Display result matrix
    printf("Resultant matrix XA + YB:\n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
            printf("%d\t", result[i][j]);
        printf("\n");
    }

    return 0;
}

// Function to calculate XA + YB for square matrices A and B
void matrixSum(int A[MAX_SIZE][MAX_SIZE], int B[MAX_SIZE][MAX_SIZE], int result[MAX_SIZE][MAX_SIZE], int n, int X, int Y)
{
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            result[i][j] = X * A[i][j] + Y * B[i][j];
}
