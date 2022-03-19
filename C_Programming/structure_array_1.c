#include<stdio.h>
#include<stdlib.h>
struct student {
    char Name[30];
    int roll;
    float marks;
};

typedef struct student stu;

void accept_Data(stu  *p)
{
	int i;
    for (i = 0; i < 5; i++) 
	{
        printf("Enter Roll no: ");
		scanf("%d", &p[i].roll);
        
		printf("Enter first name: ");
        scanf("%s", p[i].Name);
        
		printf("Enter marks: ");
        scanf("%f", &p[i].marks);
    }
}


void print_data(stu *p)
{
	printf("Displaying Information = \n");
	int i;
	for (i = 0; i < 5; ++i) 
	{
        printf("\nRoll number: %d\n",p[i].roll);
        
		printf("First name: %s\n",p[i].Name);
        
        printf("Marks: %f", p[i].marks);
        printf("\n");
    }
}

int main() 
{
    stu s[5];
    printf("Enter information of students:\n");
	
	accept_Data(s);
	print_data(s);
    return 0;
}