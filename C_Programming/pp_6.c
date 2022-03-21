//.C program to check whether the given number is positive or negative


#include<stdio.h>
int main()
{
float a;
printf("Enter the number");
	scanf("%f",&a);
	
	if(a<0)
	{
	printf("number is negative");
	}
	else
	{
	printf("number is positive");
	}
	return 0;
}
