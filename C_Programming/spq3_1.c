/*
Q3.Define the structure called Employee having members empid,empname,salary 
allocate memory to structure to store 'n' Employee information.(n should be taken from user) 
Write three functions : 
1.void getEmpDetails(strcut Employee *e) 
2.void showEmpDetails(struct Employee *e) 
3.void calculateSalary(struct Employee *e) 
{ 
which calculate salary of each employee with incentive 
if(salary >5000) then incentive is 10%of salary 
if(salary > 5000 and < 10000)then incentive is 12%of salary 
if(salary >10000) then incentive is 20%of salary 
 
 
} 
this function should display the salary after adding incentives.
*/

#include<stdio.h>
#include<stdlib.h>

struct Employee
{
	int empid;
	char empname[30];
	float  empsalary;
};
typedef struct Employee emp;

void getEmpDetails(emp *e,int n)
{
	int i;
	printf("Enter the empid = \nEnter the name\nEnter the salary = \n");
	for(i=0;i<n;i++)
	{
	scanf("%d%s%f",&e[i].empid,e[i].empname,&e[i].empsalary);
	}

}

void showEmpDetails(emp *e,int n)
{
	printf("............Display Information..................\n");
	int i;
	
	for(i=0;i<n;i++)
	{
	printf("EmpID = %d\tEmpName = %s\tEmpSalary = %f\n",e[i].empid,e[i].empname,e[i].empsalary);
	printf("\n");
	}
}

void calculateSalary(emp *e,int n)
{
	int i,empsalary;
	float incentive;
	printf("...................Calculate Salary...........\n");
	for(i=0;i<n;i++)
	{
	if(e[i].empsalary<5000)
	{
		printf("Incentive is [10%] of salary\n");
		incentive = (e[i].empsalary*10)/100;
		e[i].empsalary = (e[i].empsalary + incentive);
		printf("Incentive = %f\nempsalary = %f\n\n",incentive,e[i].empsalary);
	}		 
    else  if(5000<=e[i].empsalary<=10000)
	{
		printf("Incentive is [12%] of salary\n");
		incentive = (e[i].empsalary*12)/100;
		printf("Incentive = %f\n",incentive);
		e[i].empsalary = (e[i].empsalary + incentive);
		printf("Incentive = %f\nempsalary = %f\n\n",incentive,e[i].empsalary);
	} 
    else if(e[i].empsalary>10000) 
	{
		printf("Incentive is [20%] of salary\n");
		incentive = (e[i].empsalary*20)/100;
		printf("Incentive = %f\n",incentive);
		e[i].empsalary = (e[i].empsalary + incentive);
		printf("Incentive = %f\nempsalary = %f\n\n",incentive,e[i].empsalary);
	} 
	else
	{
		printf("invalid");
	}
	}
	
}


int main()
{
	int n;
	
	printf("Enter The Number = ");
	scanf("%d",&n);
	
	emp e[n];
	getEmpDetails(e,n);
	showEmpDetails(e,n);
	calculateSalary(e,n);

	return 0;
}	
