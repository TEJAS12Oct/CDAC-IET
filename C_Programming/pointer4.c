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
int* rotate(int arr[])
{
	int i;
   int *ar=arr;
	
	for(i=0;i<size;i++)
	{
		ar[i]=arr[i];
	}
	printf("\nNew array: \n");
    return ar;
}
void left_rotate(int arr[],int ar[])
{
	int i,temp;
	temp=ar[0];
	for(i=0;i<size-1;i++)
	{
		arr[i]=ar[i+1];
	}
	arr[i]=temp;
}
void array_roate_left(int *arr,int*ar)
{
int r,c=1;
 printf("\n enter a number of roatation : \n");
	scanf("%d",&r);
      while(c<=r)
	{
         left_rotate(arr,ar);
         
      c++;
     }	
 display(ar);

}

void rotate_right(int *arr,int *ar)
{
    int i;
	int temp=ar[size - 1];
    for(i=size-1;i>0;i--)
    {
        arr[i]=ar[i-1];
    }
    arr[i]=temp;
}
void  array_rotate_right(int *arr,int *ar)
{
    int r,c=1;
     printf("\n enter a number of roatation : \n");
	scanf("%d",&r);
    while(c<=r)
	{
         rotate_right(arr,ar);
         
      c++;
    }	
 display(arr);
}
int main()
{
	int arr[size],c=1,*ar;
	accept(arr);
	display(arr);
	ar=rotate(arr);
	display(ar);
    printf("\n-----------------------------------left rotation--------------------------------\n");
	array_roate_left(arr,ar);
    printf("\n-----------------------------------right rotation--------------------------------\n");
    array_rotate_right(arr,ar);
	
}