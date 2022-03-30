C


#include<stdio.h>
#include<stdlib.h>

void disp_2d_arr(int **); //function declaration
int main()
{
  int i,j,**ptr;
  ptr=(int **)malloc(sizeof(int *)*2);
  ptr[0]=(int *)malloc(sizeof(int)*2);
  ptr[1]=(int *)malloc(sizeof(int)*4);

  for(i=0;i<2;i++)
  {
     for(j=0;j<2;j++)
     {
        ptr[i][j]=i+j;
     }
     if(i==1)
     {
       for(j=2;j<4;j++)
       {
           ptr[i][j]=i+j;
       }
     }   


  }

  disp_2d_arr(ptr); //function call 
  return 0;
}

void disp_2d_arr(int **p) //int *p[]  array of pointers
{
   int i,j;
   for(i=0;i<2;i++)
   {
     printf("\n p[%d]=%d",i,p[i]);
     for(j=0;j<2;j++)
     {
        printf(" %d",p[i][j]); //*(*(p+i)+j);
     }
     if(i==1)
     {
       for(j=2;j<4;j++)
       {
         printf(" %d",p[i][j]);
       }
     }   
     printf("\n"); 
   }
}