//to pass 3-d array into function

#include<stdio.h>
int main()
{
   int arr[2][2][2]={{{1,2},{3,4}},{{4,5},{6,7}}};

   void disp_arr(int *); 
  
   void disp_3d_array(int ptr[][2][2]); //correct
 //void disp_2d_array(int (*ptr)[2][2]); //correct
 
 //void disp_2d_array(int ***ptr) //wrong


   disp_3d_array(arr);  //function call  //matrix
   disp_arr((int *)arr);  //All Element

   return 0;
}


void disp_arr(int *ptr)
{
  int i,j,k;
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
      for(k=0;k<2;k++)
       printf(" \n %d",*(((ptr+i*2*2)+j*2)+k));//ptr[i][j][k] wrong
    }
  }

}


void disp_3d_array(int (*ptr)[2][2]) //int ptr[][2][2]
{
   int i,j,k;
   for(i=0;i<2;i++)
   {
    for(j=0;j<2;j++)
    {
      for(k=0;k<2;k++)
      { 
         printf("  %d",ptr[i][j][k]);
      }printf("\n");
    }
    
  }
}