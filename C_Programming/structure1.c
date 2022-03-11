// Structure
#include<stdio.h>
struct student{
	char name[20];
	int age;
};

void get_info (struct student stud)
{
	
	printf("Enter  name = ");
	scanf("%s", stud.name);
	 
	printf("Enter  age = ");
	scanf("%d",&stud.age);
	
	printf(".....................................................\n");
	printf("name = %s\nage = %d\n",stud.name,stud.age);
}

 int main()
 {
	struct student ram,shyam;
	struct student age;
	 
	get_info(ram);
	get_info(shyam);
	 
	return 0;
}