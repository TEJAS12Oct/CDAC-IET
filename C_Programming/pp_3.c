// find area of triangle


#include<stdio.h>
int main()
{
  
  float b,h,area;
  printf("enter the base and height");
  scanf("%f%f",&b,&h);
  
  area =0.5*b*h;
  printf("area of triangle = %f",area);
  return 0;

}