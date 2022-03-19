// swapping numbers

#include<stdio.h>
int main()
{
	int a,b,temp;
	printf("Enter the two number");
	scanf("%d%d",&a,&b);
	
	printf("before swap = %d %d",a,b);
	temp =  a;
	a = b;
	b = temp;
	
	printf(" after swap = %d %d",a,b);
	return 0;
	
}
