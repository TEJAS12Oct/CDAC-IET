// reverse array

// array reverse

//oder  = 1 2 3 4 5 
//reverse =  5 4 3 2 1 


#include<stdio.h>
void accept(int arr[]);
void  print_array(int *);
void rev_arr_2(int  *);

int main()
{
	int arr[7];
	int tar_arr[7];
	int i;

	accept(arr);
	printf("original array=\n");
	print_array(arr);
	
	rev_arr_2(arr);
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
	
}

void rev_arr_2(int  *a)
{
	int i,j,temp;
	
	for(i=0,j=6;i<j;i++,j--)
	{
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
