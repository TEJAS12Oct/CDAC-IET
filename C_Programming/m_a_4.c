#include<stdio.h>
#include<stdlib.h>
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
void display_info(struct student stud)
{
	printf("............Dislplay Information..................\n");
	printf("name = %s\nage = %d\n",stud.name,stud.age);
}

void print_eldest_student(struct student* my_students,int no_of_studs)
{
	int i=0;
	int max_age = 0;
	char *max_age_name;
	for(i=0;i<no_of_studs;i++)
	{
		if(max_age <my_students[i].age)
		{
			max_age = my_students[i].age;
			max_age_name = my_students[i].name;
		}
	}
	printf("Eldest students age : %d\n",max_age);
	printf("Eldest students name  : %s\n",max_age_name);
}

 int main()
 {
 
	int no_of_students=0;
	printf("Enter no of  students = ");
	scanf("%d",&no_of_students);
	
	struct student* my_students = (struct student*) malloc (no_of_students * sizeof(struct student));
	
	int  i;
	for (i=0;i<no_of_students;i++)
	{
		get_info(&my_students[i]);
	}
	
	for (i=0;i<no_of_students;i++)
	{
		display_info(my_students[i]);
	}
	
	print_eldest_student( my_students,no_of_students);
	
	free(my_students);
	return  0;
	
	
	 
	return 0;
}