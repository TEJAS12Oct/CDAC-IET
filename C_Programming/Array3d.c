//3-d array

#include<stdio.h>
int main()
{
  int arr[2][2][2]={{{1,2},{3,4}},{{5,6},{7,8}}};
  int i,j,k;
  printf("\n arr = %d",arr); 
  for(i=0;i<2;i++)
  {
     printf("\n arr[%d] = %d",i,arr[i]);
     for(j=0;j<2;j++)
     {
       printf("\n arr[%d][%d] = %d",i,j,arr[i][j]);
       for(k=0;k<2;k++)
       {
		 printf("\n arr[%d][%d][%d] = %d",i,j,k,arr[i][j][k]);
         printf("\n (*(*(arr+%d)+%d)+%d) = %d",i,j,k,(*(*(arr+i)+j)+k));      //&arr[i][j][k]
         printf("\n *(*(*(arr+%d)+%d)+%d) = %d",i,j,k,*(*(*(arr+i)+j)+k));  //arr[i][j][k] 
       } printf("\n");
     }
   }
   
   return 0;
}


/*
output =
 arr = -50333280
 arr[0] = -50333280
 arr[0][0] = -50333280
 arr[0][0][0] = 1
 (*(*(arr+0)+0)+0) = -50333280
 *(*(*(arr+0)+0)+0) = 1
 arr[0][0][1] = 2
 (*(*(arr+0)+0)+1) = -50333276
 *(*(*(arr+0)+0)+1) = 2

 arr[0][1] = -50333272
 arr[0][1][0] = 3
 (*(*(arr+0)+1)+0) = -50333272
 *(*(*(arr+0)+1)+0) = 3
 arr[0][1][1] = 4
 (*(*(arr+0)+1)+1) = -50333268
 *(*(*(arr+0)+1)+1) = 4

 arr[1] = -50333264
 arr[1][0] = -50333264
 arr[1][0][0] = 5
 (*(*(arr+1)+0)+0) = -50333264
 *(*(*(arr+1)+0)+0) = 5
 arr[1][0][1] = 6
 (*(*(arr+1)+0)+1) = -50333260
 *(*(*(arr+1)+0)+1) = 6

 arr[1][1] = -50333256
 arr[1][1][0] = 7
 (*(*(arr+1)+1)+0) = -50333256
 *(*(*(arr+1)+1)+0) = 7
 arr[1][1][1] = 8
 (*(*(arr+1)+1)+1) = -50333252
 *(*(*(arr+1)+1)+1) = 8
*/