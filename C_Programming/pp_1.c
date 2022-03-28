//1. Find Area Of circle


#include<stdio.h>
int main()
{
	float r,area;
	printf("Enter the radius");
	scanf("%f",&r);
	
	area= 3.142*r*r;
	printf("area = %f",area);
	return 0;
}