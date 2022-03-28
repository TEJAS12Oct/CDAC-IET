//2. Write a C program to find subtraction of two integer number.


#include<stdio.h>
int main()
{
	int n1,n2,sub;
	printf("Enter Two number");
	scanf("%d%d",&n1,&n2);
	sub = n1 - n2;
	printf("Sub = %d",sub);
	return 0;
}