#include<stdio.h>
#define size 5
void accept(int arr[])
{
	int i;
	printf("\n enter a elements : \n");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
}
void display(int ar[])
{
	int i;
	printf("\nelements are: \n");
		for(i=0;i<size;i++)
	{
		printf("%4d",ar[i]);
	}
}

void left_rotate(int arr[])
{
	int i,temp;
	temp=arr[0];
	for(i=0;i<size-1;i++)
	{
		arr[i]=arr[i+1];
	}
	arr[i]=temp;
}
void array_roate_left(int *arr)
{
int r,c=1;
 printf("\n enter a number of roatation : \n");
	scanf("%d",&r);
      while(c<=r)
	{
         left_rotate(arr);
         
      c++;
     }	
 display(arr);

}

void rotate_right(int *arr)
{
    int i;
	int temp=arr[size - 1];
    for(i=size-1;i>0;i--)
    {
        arr[i]=arr[i-1];
    }
    arr[i]=temp;
}
void  array_rotate_right(int *arr)
{
    int r,c=1;
     printf("\n enter a number of roatation : \n");
	scanf("%d",&r);
    while(c<=r)
	{
         rotate_right(arr);
         
      c++;
    }	
 display(arr);
}
int main()
{
	int arr[size],c=1;
	accept(arr);
	display(arr);
	
    printf("\n-----------------------------------left rotation--------------------------------\n");
	array_roate_left(arr);
    printf("\n-----------------------------------right rotation--------------------------------\n");
    array_rotate_right(arr);
	
}