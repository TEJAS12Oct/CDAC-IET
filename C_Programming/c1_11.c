//11. Write a C Program to accept a character from user and check it is alphabet or digit.

#include<stdio.h>
int main()
{
      
	   char ch;
	  
	   
	  printf("Enter the character");
	  scanf("%c",&ch);
	  
	  if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	  {
		  printf("ch is an alphabet");
		  
	  }
	  else if (ch>='0' && ch<='9')
	  {
		  printf("ch is a  digit");
		  
	  }
	  else {
		  printf("ch is a special character");
	  }
}