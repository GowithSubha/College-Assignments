// Find maximum and minimum of n numbers.
#include <stdio.h>
int main(int argc, char const *argv[])
{
    int a[100], n, i, max, min;
    printf("Enter the range of n numbers:");
    scanf("%d", &n);
    printf("Enter the numbers: \n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    max = a[0];
    min = a[0];
    for (i = 1; i < n; i++)
    {
        if (a[i] > max)
            max = a[i];
        else if (a[i] < min)
            min = a[i];
    }
    printf("%d is maximum number \n", max);
    printf("%d is minimum number \n", min);
    return 0;
}
