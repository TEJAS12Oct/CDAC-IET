// Array Programs

#include<stdio.h>
int main()
{
	

  int arr[5];
  
  printf("Enter 5 numbers:");
  scanf("%d", &arr[0]);
  scanf("%d", &arr[1]);
  scanf("%d", &arr[2]);
  scanf("%d", &arr[3]);
  scanf("%d", &arr[4]);

  printf("arr[0] = %d, &arr[0] = %d\n", arr[0], &arr[0]);
  printf("arr[1] = %d, &arr[1] = %d\n", arr[1], &arr[1]);
  printf("arr[2] = %d, &arr[2] = %d\n", arr[2], &arr[2]);
  printf("arr[3] = %d, &arr[3] = %d\n", arr[3], &arr[3]);
  printf("arr[4] = %d, &arr[4] = %d\n", arr[4], &arr[4]);
  
  return 0;
}