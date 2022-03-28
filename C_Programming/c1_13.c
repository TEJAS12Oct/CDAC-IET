// 13.Write a C Program to convert uppercase character into lower case character and vice versa.

#include<stdio.h>
int main()
{

char ch,a,b;
printf("Enter a character convert into Case");
scanf("%c",&ch);
a=ch+32;
b=ch-32;
if(( 65>=ch) && (ch<=90))
{
	printf(" The convert case is %c",a);
}
else{
	printf("the convert case is %c",b);
}
return 0;
}