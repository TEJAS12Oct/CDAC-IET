// Swapping no



#include<stdio.h>
void swap(int a, int b );
int main()
{
	int a,b;
	printf("Enter the two number");
	scanf("%d%d",&a,&b);
	printf("before swap = %d %d\n",a,b);
	swap(a,b);
	return 0;
}
void swap(int a, int b ){
	int temp;
	temp =  a;
	a = b;
	b = temp;
	
	printf("after swap = %d %d",a,b);
}