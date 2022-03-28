#include<stdio.h>
#include <stdlib.h>
struct student{
	char name[20];
	int age;
};

void get_info (struct student *stud)
{
	
	printf("Enter  name = ");
	scanf("%s", stud->name);
	 
	printf("Enter  age = ");
	scanf("%d",&stud->age);
}
void display_info(struct student *stud)
{
	printf("............Dislplay Information..................\n");
	printf("name = %s\nage = %d\n",stud->name,stud->age);
}

 int main()
 {
	
	
	struct student *s1 = (struct student*) malloc (sizeof(struct student));
	struct student *s2 = (struct student*) malloc (sizeof(struct student));
	
	 
	get_info(s1);
	display_info(s1);
	get_info(s2);
	display_info(s2);
	
	if(s1->age >= s2->age)
		printf("\n%s",s1->name);
	else{
		printf("\n%s",s2->name);
	}
	
	free(s1);
	free(s2);
	 
	return 0;
}