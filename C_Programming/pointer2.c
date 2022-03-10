#include<stdio.h>
#define SIZE 5
void print_array(int *ptr);
void display(int *ptr);
void left_shift(int *ptr);
void left_rotate(int *ptr);
void right_shift(int *ptr);
void right_rotate(int *ptr);


int main()
{
	int arr[SIZE];
    
	int *ptr = arr;
	
	print_array(arr);
	display(arr);
	left_shift(arr);
	left_rotate(arr);
	right_shift(arr);
    right_rotate(arr);
	return 0;
}


void print_array(int *ptr)
{ 
	int i;
	printf("\nEnter elemnts = \n");
	for(i=0;i<SIZE;i++)
	{
		scanf("%d",&ptr[i]);
	}
}

void display(int *ptr)
{
	int i=0;
	printf("display elements =");
	for(i=0;i<SIZE;i++)
	{
		printf("%d",ptr[i]);
	}
}


void left_shift(int *ptr)
{
	int i;
	
	for(i=0;i<SIZE-1;i++)
	{
		ptr[i] = ptr[i+1];
		
	}
	ptr[i]=0;
	printf("\n");
	printf("\nleft_shift\n");
	display(ptr);
	
}



void left_rotate(int *ptr)
{
	int i;
	
	int temp = ptr[0];
	for(i=0;i<SIZE-1;i++)
	{
		ptr[i] = ptr[i+1];
		
	}
	ptr[i]=temp;
	printf("\n");
	printf("\nleft_rotate\n");
	display(ptr);
	
}




void right_shift(int *ptr)
{
	int i;
	
	for(i=SIZE-1;i>0;i--)
	{
		ptr[i] = ptr[i-1];
		
	}
	ptr[i]=0;
	printf("\n");
	printf("\nright_shift\n");
	display(ptr);
}


void right_rotate(int *ptr)
{
	int i;
	
	int temp = ptr[SIZE - 1];
	
	for(i=SIZE-1;i>0;i--)
	{
		ptr[i] = ptr[i-1];
		
	}
	ptr[i]=temp;
	printf("\n");
	printf("\nright_rotate\n");
	display(ptr);
	
}
