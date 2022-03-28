/*
Q2.Write user defined function to accept number from user and display if it is positive or negative.
Void check_positive(int n){}
*/


#include<stdio.h>
void check_positive(int n);
int main()
{
	int  n;
    check_positive(n);
	return 0;
}

void check_positive(int n)
{
	
	printf("Enter the number = ");
	scanf("%d",&n);
	if(n>0)
		printf("no is positive = %d",n);
	else
		printf("no is negative = %d",n);
}
