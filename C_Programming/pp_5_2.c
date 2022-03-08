//percentagen.c
//Accept 5 subject marks from user and calculate percentage for the same.


#include<stdio.h>
int main()
{
  
  float english , math, science ,history ,geography , percentage;
  int total_Marks;
  
  printf("enter the english marks out of 100 = ");
  scanf("%f",&english);
  
   printf("enter the math marks out of 100 = ");
  scanf("%f",&math);
  
   printf("enter the science marks out of 100 = ");
  scanf("%f",&science);
  
   printf("enter the history marks out of 100 = ");
  scanf("%f",&history);
  
   printf("enter the geography marks out of 100 = ");
  scanf("%f",&geography);
  
  total_Marks = 500;
  percentage = ((english + math + science + history + geography) / total_Marks)*100;
  
  
  printf("percentage = %f\n",percentage);
  
  if(percentage>=75){
	printf("grade A");}
  else if (65<=percentage<75)
	 printf("grade B");
  else if ( 55<= percentage<65)
	 printf("grade c");
  else{
	 printf("grade d");
  }
  return 0;

}