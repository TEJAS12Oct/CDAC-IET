//Write a Program to print sum of digits of user entered number.
//For Example: If input is 123 then output is 1+2+3=6



#include<stdio.h>
int main()
{
	
	int a,b,c,d,n,sum;
	printf("Enter the Number");
	scanf("%d",&n);
	
	
	a=n/100;  //1
	b=n%100;  //23
	c=b/10;   //2
	d=b%10;   //3
	sum =  a+c+d;
	printf("sum =  %d",sum);
	
	
	return 0;
}