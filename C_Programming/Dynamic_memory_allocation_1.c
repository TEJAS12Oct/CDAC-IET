//2-d array dynamic memory allocation


#include<stdio.h>
#include <stdlib.h>
void disp_2d_arr(int **); //function declaration
int main()
{
  int i,j,**ptr;
  ptr=(int **)malloc(sizeof(int *)*3);
  for(i=0;i<3;i++)
    ptr[i]=(int *)malloc(sizeof(int)*3);

  for(i=0;i<3;i++)
  {
     for(j=0;j<3;j++)
     {
        ptr[i][j]=i+j;
     }
  }

  disp_2d_arr(ptr); //function call 
  return 0;
}

void disp_2d_arr(int **p) //int *p[]  array of pointers
{
   int i,j;
   for(i=0;i<3;i++)
   {
     printf("\n p[%d]=%d",i,p[i]);
     for(j=0;j<3;j++)
     {
       printf(" %d",p[i][j]);// *(*(p+i)+j)
		
     }
     printf("\n"); 
   }
}  