// Write a program to calculate area of triangle.
#include<stdio.h>
#include<math.h>
int main(int argc, char const *argv[])
{
    float a, b, c, s, area;
    printf("\n----------------Calculate Area of a Triangle----------------\n \n");
    printf("Enter the 1st side of the triangle: ");
    scanf("%f", &a);
    printf("Enter the 2nd side of the triangle: ");
    scanf("%f", &b);
    printf("Enter the 3rd side of the triangle: ");
    scanf("%f", &c);

    s=(a+b+c)/2;
    // printf("%.2f", s);
    area=sqrt(s*(s-a)*(s-b)*(s-c));
    printf("Area of the triangle= %.2f", area);
    return 0;
}
