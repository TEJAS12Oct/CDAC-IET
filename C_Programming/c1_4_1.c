//Write C program to find cube of an integer number using two different methods.
//1. Without using Built-in Function pow()

#include<stdio.h>
int main()
{
	int n1,n2;
	printf("Enter the Number");
	scanf("%d",&n1);
	n2 = n1*n1*n1;
	printf("Cube = %d",n2);
	return 0;
}
