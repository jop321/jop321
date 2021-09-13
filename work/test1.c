#include<stdio.h>
int main()
{
    double a[3];
    for (int i = 0; i < 3; i++)
    {
        scanf("%lf", &a[i]);
    }
    for (int i = 1; i < 3; i++)
    {
        if (a[i-1] > a[i]){
            a[i] = a[i-1];
        }
    }
    printf("%lf",a[2]);
    return 0;
}
