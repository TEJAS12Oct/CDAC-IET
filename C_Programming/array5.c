#include <stdio.h>
#define ARR_SIZE 5

void print_array(int brr[ARR_SIZE])
{
  int i=0;
  for(i=0; i< ARR_SIZE; i++)
  {
     printf("%d, ", brr[i]);
  }
  printf("\n");
}

void fun(int brr[ARR_SIZE])
{
  printf("Size of array in fun %d\n", sizeof(brr) );
  brr[2] = 10;
}

void fun2(int *crr)
{
  printf("Size of array in fun2 %d\n", sizeof(crr) );
  crr[0] = 100;
}

int main()
{

  int arr[ARR_SIZE];
  
  printf("Enter %d numbers:", ARR_SIZE);
  
  int i=0;
  for(i=0;i<ARR_SIZE;i++)
  {
    scanf("%d", &arr[i]);  
  }
  
  print_array(arr);
  
  printf("Size of array in main %d\n", sizeof(arr) );
  fun(arr);
  fun2(arr);
  print_array(arr);
 
  return 0;

}
