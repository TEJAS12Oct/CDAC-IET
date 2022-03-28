// divisible by 5

#include<stdio.h>
int main()
{
	int num,results;
	printf("Enter a number");
	scanf("%d",&num);
	
	results = num % 5;
	if(results == 0)
		printf("num is divisible by 5");
	else 
		printf("num is not divisible by 5");
	return 0;
}
	
	