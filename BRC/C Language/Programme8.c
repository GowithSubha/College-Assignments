// Write a program to take basic salary of an employee. DA is 15% of basic salary, HRA is 13% of Basic Salary and TA is 10% of basic salary. Calculate gross salary. (da+hra+ta)
#include<stdio.h>
int main(int argc, char const *argv[])
{
    float BS, da, hra, ta, gross_salary;
    printf("Enter your basic salary \n");
    scanf("%f", &BS);
    da = BS * 15/100;
    printf("Your da = %.2f \n", da);
    hra = BS * 13/100;
    printf("Your hra = %.2f \n", hra);
    ta = BS * 10/100;
    printf("Your ta = %.2f \n", ta);
    gross_salary = (BS + da + hra + ta);
    printf("Your Gross Salary = %.2f \n", gross_salary);

    return 0;
}
