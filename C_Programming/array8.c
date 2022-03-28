// array reverse

//oder  = 1 2 3 4 5 
//reverse =  5 4 3 2 1 


#include<stdio.h>
void accept(int arr[]);
void rev_arr(int *,int *);
void print_array(int arr[]);
int main()
{
	
	int arr[7];
	int tar_arr[7];
	int i;
	
	
	accept(arr);
	
	printf("original array=\n");
	print_array(arr);
	
	rev_arr(arr,arr);
	printf("reverse array=\n");
	
	print_array(arr);
	
	return 0;
	
}
void accept(int arr[])
{
	printf("Enter the no = ");
	int i;
	for(i=0;i<7;i++)
	{
		
		scanf("%d",&arr[i]);
	}
}
void  print_array(int *a)
{
	int i;
	for(i=0;i<7;i++)
	{
		printf("%d\n",a[i]);
	}		
	printf("\n");
	
	return;
	
}

void rev_arr(int *a,int *t)
{
	int i,j;
	for(i=6,j=0;i>=0;i--,j++)
	{
		t[j] = a[i];
	}
	return;
}


