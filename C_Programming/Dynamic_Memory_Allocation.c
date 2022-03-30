// dynamic memory allocation in C


#include<stdio.h>
#include <stdlib.h>
int main()
{
   int num=40,*ptr=&num;
   int *dptr;

   dptr=malloc(4);
   printf("\n ptr = %d",ptr);
   printf("\n *ptr = %d",*ptr);
   printf("\n address of ptr = %d",&ptr);
   printf("\n dptr = %d",dptr);
   return 0;
}