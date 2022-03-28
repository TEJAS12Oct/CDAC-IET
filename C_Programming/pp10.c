// pattern proble 
/*
5
4 4
3 3 3
2 2 2 2
1 1 1 1 1
*/

#include<stdio.h>
int  main()
{
int i,j,cnt=5;
for(i=1;i<=5;i++)  
{
   for(j=1;j<=i;j++)  
   {
     printf("%d ",cnt);  
   }
   cnt=cnt-1;
   printf("\n");
}
}


