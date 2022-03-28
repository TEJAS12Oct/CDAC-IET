#include<stdio.h>
#include<stdlib.h>

void print_array(int *pptr)
{
	printf("%d\n",pptr[2]);
}

int main()
{
	int i=10;
	int *ptr = (int*) malloc(20);
	
	ptr[0]=1;
	ptr[1]=2;
	ptr[2]=3;
	ptr[3]=4;
	ptr[4]=5;
	
	print_array(ptr);
	return 0;
	
	
}