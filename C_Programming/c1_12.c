//12.Write a C Program to accept a character from user and 
//check if entered character is vowel or consonant


#include<stdio.h>
int main()
{
	char ch;
	printf("Enter the character");
	scanf("%c",&ch);
	  
	  
	  if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' ||ch=='U'|| ch=='a'|| ch=='e' || ch=='I' || ch=='O' ||ch=='U')
	  {
		  printf("%c Character is Vowel",ch);
	  }
	  else
	  {
		  printf("%c  character is consonant",ch);
	  }
	  return 0;
}