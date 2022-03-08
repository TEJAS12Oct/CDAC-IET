//7. Write a C Program to check whether number is EVEN or ODD. 
//Read an integer number and program will check whether given integer number is EVEN or ODD.


#include<stdio.h>
int main()
{
	int n;
	printf("Enter the Number");
	scanf("%d",&n);
	
	if(n%2==0)
		printf("Number Is Even");
	else
		printf("number  is  odd");
	
	return 0;
}