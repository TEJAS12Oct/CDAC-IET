// Array Problem

#include <stdio.h>
#define ARR_SIZE 5

void print_value(int A)
{
   printf("A=%d\n", A);
}

int sum(int Crr[ARR_SIZE])
{
  int sum=0, i=0;
  for(i=0;i<ARR_SIZE;i++)
  {
     sum = sum + Crr[i];    
  }
  return sum;
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
  
  int result = sum(arr);

  print_value(arr[2]);
  printf("Sum of arr: %d\n", result); 
  return 0;

}
