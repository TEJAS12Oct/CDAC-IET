//14.Write a C Program to Check Whether the Entered Year is Leap Year or not.

#include<stdio.h>
int main()
{
	int n;
	printf("Enter the year");
	scanf("%d",&n);
	
	if(n%4==0 && n!=0)
	{
		printf("leap year");
	}
	else{
		printf("not  leap year");
	}
}