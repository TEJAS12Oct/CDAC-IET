//to pass 2-d array into function

#include<stdio.h>
int main()
{
   int twoarr[3][3]={{1,2,3},{4,5,6},{7,8,9}};

   void disp_arr(int *); 
  
   void disp_2d_array(int ptr[][3]); //correct
   
 //void disp_2d_array(int (*ptr)[3]); //correct
   
 //void disp_2d_array(int **ptr) // Wrong


   disp_2d_array(twoarr);  //function call  //  print matrix form

  
   disp_arr((int *)twoarr);  // display all Element 

   return 0;
}
//(int *) = typecasting = changing an variable of one data type into another // POINTER TO INT CONVERSION
//output : = 1 2 3 4 5 6 7 8 9 


void disp_arr(int *ptr)
{
  int i,j;
  for(i=0;i<3;i++)
  {
    for(j=0;j<3;j++)
    {
       printf(" \n %d",*((ptr+i*3)+j));  //ptr[i][j] wrong
    }
  }
}


void disp_2d_array(int (*ptr)[3]) //int ptr[][3]
{
   int i,j;
   for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
    {
       printf("  %d",ptr[i][j]);
    }
    printf("\n");
  }
}

/*
output : = 
1  2  3
4  5  6
7  8  9
*/