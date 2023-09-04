// Write a program to calculate the distance between 2 points in a 2D coordinate system.
#include<stdio.h>
#include<math.h>
int main(int argc, char const *argv[])
{
    float x1, y1, x2, y2, d;
    printf("Enter 1st point: \n" );
    scanf("%f %f", &x1, &y1);
    printf("Enter 2nd point: \n" );
    scanf("%f %f", &x2, &y2);
    d=sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    printf("Distance between 2 points= %.2f\n", d);
    return 0;
}
