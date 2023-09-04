#include<stdio.h>
float sum (float, float);
int main()
{
    float a, b, c;
    printf(" Enter two numbers: ");
    scanf("%f %f", &a, &b);
    c = sum (a,b);
    printf("%f", c);
    return 0;
}
float sum (float a, float b)
{
    float p;
    p = a + b;
    return (p);
}
