#include<stdio.h>

void disp_3d_array(int (*ptr)[2][3]) 
{
   int i,j,k;
   for(i=0;i<2;i++)
   {
    for(j=0;j<2;j++)
    {
		for(k=0;k<3;k++)
		{
				printf("  %d",ptr[i][j][k]);
		}printf("\n");
	}
    
  }
}
int main()
{
  int arr[2][2][3]={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
  int i,j,k;
  printf("\n arr = %d",arr); 
  for(i=0;i<2;i++)
  {
     printf("\n arr[%d] = %d",i,arr[i]);
     for(j=0;j<2;j++)
     {
       printf("\n arr[%d][%d] = %d",i,j,arr[i][j]);
       for(k=0;k<3;k++)
       {
		 printf("\n arr[%d][%d][%d] = %d",i,j,k,arr[i][j][k]);
         printf("\n (*(*(arr+%d)+%d)+%d) = %d",i,j,k,(*(*(arr+i)+j)+k));      //&arr[i][j][k]
         printf("\n *(*(*(arr+%d)+%d)+%d) = %d",i,j,k,*(*(*(arr+i)+j)+k));  //arr[i][j][k] 
       } printf("\n");
     }
   }
   disp_3d_array(arr);
   return 0;
}