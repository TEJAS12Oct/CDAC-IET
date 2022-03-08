// Histogram


#include<stdio.h>
int validate_input(int num1,int num2,int num3,int num4,int num5);
int print_histogram(int num,char ch);
int main()
{
	char c1,c2,c3,c4,c5;
	printf("Enter the 5 character= ");
	scanf("%c %c %c %c %c",&c1,&c2,&c3,&c4,&c5);
	
	int num1=0,num2=0,num3=0,num4=0,num5=0;
	printf("Enter the 5 numbers = ");
	scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
	
	int  ret_value = validate_input(num1,num2,num3,num4,num5);
	if(ret_value == 1)
	{
		// the input is invalid . hence,exit.
		printf("invalid input, try in the range  of 0 to 99\n");
		return -1;
	}
	printf("--------------------Histrogram--------------------\n");
	// all numbers are in range 0 to 99
		print_histogram(num1,c1);
		print_histogram(num2,c2);
		print_histogram(num3,c3);
		print_histogram(num4,c4);
		print_histogram(num5,c5);
	
}

// to  check whether input number is in between0 to 99
//  this function return 0 on success
int  validate_input(int n1,int n2,int n3,int n4,int n5)
{
	
	if( (n1>-1  && n1<100) && 
		(n2>-1  && n2<100) && 
		(n3>-1  && n3<100) && 
		(n4>-1  && n4<100) && 
		(n5>-1  && n5<100) )
	{	
	return 0;
	}
	else
	{
		return 1;
	}
}
//this function prints histogram  of sigle input  number
// no return value
// eg.
// 17: *****************
int print_histogram(int num,char ch)
{
	printf("\n");
	printf("%d : ", num);
	int i =0;
	for(;i<num;i++)
	{
		printf("%c",ch);
		
	}
	
}