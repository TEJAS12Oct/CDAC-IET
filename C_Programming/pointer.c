#include<stdio.h>
void print_array(int *);
void fun ( int *);
#define SIZE 5
int main()
{
	int arr[SIZE] = {1,2,3,4,5};
    int i;
	int *ptr = arr;



for(i=0;i<5;i++)
{
	printf("\n  Address of arr = %d",i,&arr[i]); 
	
	printf("\n  value of ptr = %d",ptr);
	
	printf("\n  value of arr = %d",i,arr[i]);
	
	printf("\n  value of ptr = %d\n",*ptr);
	ptr = ptr+1;
}
	print_array(arr);
	fun(arr);
	printf("\nTejas");
	return 0;
}

void print_array(int *p)
{ 
	int i;
	for(i=0;i<5;i++)
{
	printf("\n %d",*(p+i));
	printf("%d",*(i+p));
	printf("%d",p[i]);
	printf("%d",i[p]);

}

}

void fun(int *p)
{
	p = p+3;
	printf("\n p[-2] = %d", p[-2]);
	//printf("\n %d", (-2)[p]);
	
}

