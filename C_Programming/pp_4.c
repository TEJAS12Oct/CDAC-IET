//solve below formula by taking input from user for the values of a and b
//(a+b)2=a2+2ab+b2
//=a*a+2*a*b+b*b


#include<stdio.h>
int main()
{
  
  float a,b,formula;
  printf("enter the a and b");
  scanf("%f%f",&a,&b);
  
  formula = a*a+2*a*b+b*b;
  printf("ans = %f",formula);
  return 0;

}