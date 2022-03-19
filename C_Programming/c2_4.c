//Write a C Program to print sum of 1 to ‘N’ odd numbers. (Use for loop)



#include<stdio.h>
int main()
{
	int i,n,sum;
	printf("enter the number");
	scanf("%d",&n);
	sum = 0;
	
	for(i=1;i<=n;i++)
	{
	printf("i = %d\n",i);
	if(i%2!=0){
	printf("odd No %d\n",i);
    sum = sum + i;
	}
	
	}
	
	printf(" sum of odd  number  = %d",  sum);
	return 0;
}