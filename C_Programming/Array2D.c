// 2d Array

#include<stdio.h>

int main()
{
   int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
   int i,j;
   for(i=0;i<3;i++)
   {
     printf("\narr[%d] = %d",i,arr[i]);
     printf("\n   *(arr + %d) = %d",i,*(arr+i));
     for(j=0;j<3;j++)
     {
        printf("\n  (*(arr+%d)+%d) = %d",i,j,(*(arr+i)+j));//&arr[i][j]
        printf("\n *(*(arr+%d)+%d) = %d",i,j,*(*(arr+i)+j));
     }printf("\n");
   }
   return 0;
}