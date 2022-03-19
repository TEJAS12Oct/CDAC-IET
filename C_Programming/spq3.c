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
#include<math.h>

struct Employee
{
	int empid;
	char empname[10];
	float empsalary;
};
typedef struct Employee emp;

void getEmpDetails(emp *e)
{
	printf("Enter the empid = \n");
	scanf("%d",&e->empid);
	
	printf("Enter the name = \n");
	scanf("%s",e->empname);
	
	printf("Enter the salary = \n");
	scanf("%f",&e->empsalary);

}

void showEmpDetails(emp e)
{
	printf("............Display Information..................\n");
	printf("EmpID = %d\tEmpName = %s\tEmpSalary = %f\n",e.empid,e.empname,e.empsalary);
	
}

void calculateSalary(emp *e)
{
	int i,empsalary;
	float incentive;
	printf("...................Calculate Salary...........\n");
	if(e->empsalary<5000)
	{
		printf("Incentive is [10%] of salary\n");
		incentive = (e->empsalary*10)/100;
		e->empsalary = (e->empsalary + incentive);
		printf("Incentive = %f\nempsalary = %f\n\n",incentive,e->empsalary);
	}		 
    else  if(5000<e->empsalary<=10000)
	{
		printf("Incentive is [12%] of salary\n");
		incentive = (e->empsalary*12)/100;
		e->empsalary = (e->empsalary + incentive);
		printf("Incentive = %f\nempsalary = %f\n\n",incentive,e->empsalary);
	} 
    else if(e->empsalary>10000) 
	{
		printf("Incentive is [20%] of salary\n");
		incentive = (e->empsalary*20)/100;
		e->empsalary = (e->empsalary + incentive);
		printf("Incentive = %f\nempsalary = %f\n\n",incentive,e->empsalary);
	} 
	else
	{
		printf("invalid");
	}
	
}


int main()
{
	emp e;
	getEmpDetails(&e);
	showEmpDetails(e);
	calculateSalary(&e);

	return 0;
}	
