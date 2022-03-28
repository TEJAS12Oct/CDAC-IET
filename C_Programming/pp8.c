// pattern problem
/*
2
3 4
4 5 6
5 6 7 8
6 7 8 9 10
*/

#include<stdio.h>
int main()
{
int i,j,cnt=1,pcnt;
for(i=2;i<=6;i++)   //i=5
{
   pcnt=i;
   for(j=1;j<=cnt;j++)  //j=1
   {
      printf("%d ",pcnt);   
      pcnt=pcnt+1;
   }
   cnt=cnt+1; 
   printf("\n");
}
}