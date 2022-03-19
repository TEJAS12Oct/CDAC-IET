//structure using array

#include<stdio.h>
#include<stdlib.h>
struct student
{
	char name[20];
	int roll_no;
};
typedef struct student stu;
 
void accept_Data(stu *p)
{
	int i;
	printf("enter name and roll no :\n");
	for(i=0;i<3;i++)
	{
		scanf("%s",p[i].name);
		scanf("%d",&p[i].roll_no);
	}
}
void print_data(stu *p)
{
	int i;
	for(i=0;i<3;i++)
	{
		printf("NAME: %s\t ROLL_NO:%d\n",p[i].name,p[i].roll_no);
	}
}
int main()
{
stu s[3];
accept_Data(s);
print_data(s);
return 0;
}