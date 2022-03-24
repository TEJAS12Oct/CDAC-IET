//Addition of 2 matrices and store the result in matrix res


#include<stdio.h>
int main()
{
  int i,j;
  int arr1[2][2]={{1,2},{3,4}};
  int arr2[2][2]={{6,7},{8,9}};
  int res[2][2];
  
  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
       res[i][j]=arr1[i][j]+arr2[i][j];
    }
  }

  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
       printf("  %d",res[i][j]);
    }
    printf("\n");
  }

  for(i=0;i<2;i++)
  {
    for(j=0;j<2;j++)
    {
       if(i==j)
         printf("  Diagonal Elememts  = %d",res[i][j]);
    }
    printf("\n");
  }
  return 0;
}


/*
1  2    +     6   7			addtion of matrix	=>    7   9
3  4          8   9                  			=>    11  13
*/