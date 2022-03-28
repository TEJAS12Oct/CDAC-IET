// Structure
#include<stdio.h>
struct student{
	char name[20];
	int age;
};
 int main()
 {
	 struct student tejas , chanchal ,sagar;
	 struct student age;
	 
	 printf("Enter 1st name = ");
	 scanf("%s", tejas.name);
	 
	 printf("Enter 1st age = ");
	 scanf("%d",&tejas.age);
	 
	  printf("Enter 2nd name = ");
	 scanf("%s", chanchal.name);
	 
	 printf("Enter 2nd age = ");
	 scanf("%d",&chanchal.age);
	 
	  printf("Enter 3rd name = ");
	 scanf("%s", sagar.name);
	 
	 printf("Enter 3rd age = ");
	 scanf("%d",&sagar.age);
	 
	 
	 printf(".....................................................\n");
	 printf(" name = %s  age = %d\n",tejas.name,tejas.age);
	 printf(" name = %s  age = %d\n",chanchal.name,chanchal.age);
	 printf(" name = %s  age = %d\n",sagar.name,sagar.age);
	 
	 
	 return 0;
}