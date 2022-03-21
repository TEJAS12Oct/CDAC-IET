// Swapping no using  pointer
// call by address  / call by  refrence



#include<stdio.h>
void swap(int* n1, int* n2 );
int main()
{
	int a,b;
	printf("Enter the two number  = ");
	scanf("%d%d",&a,&b);
	printf("before swap = %d %d\n",a,b);
	swap(&a,&b);
	printf("after swap = %d %d",a,b);
	return 0;
}
void swap(int* n1, int* n2 ){
	int temp;
	temp =  *n1;
	*n1 = *n2;
	*n2 = temp;
}


// a==>8  =>  *n1=>1000=>  *(1000)=>  value at 1000
// b==>10 =>  *n2=>1004=>  *(1004)=>  value at 1004