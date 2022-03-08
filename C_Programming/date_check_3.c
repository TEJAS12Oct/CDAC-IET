// Date check  is  valid


#include<stdio.h>
void  LeapYear(int year);
int main()
{
	int n,date,month,year;
	
	printf("Enter the Date = ");;
	scanf("%d",&date);
	
	printf("Enter the Month = ");
	scanf("%d",&month);
	
	printf("Enter the year = ");
	scanf("%d",&year);
	
	if(31>=date>=1 &&  month == 1 ||  month == 3 ||  month == 5  ||  month == 7 ||  month == 8 ||  month == 10 ||  month == 12)
	{
		LeapYear(year);
		printf("Date = %d-%d-%d",date,month,year);
	
	}
	else if ( 28>=date>=1  && month == 2 || 29 == date)
	{
		LeapYear(year);
		printf("Date = %d-%d-%d",date,month,year);
	}
	else if(30>=date>=1 &&  month == 4 ||  month == 6 ||  month == 9  ||  month == 11 ) 
	{
		LeapYear(year);
		printf("Date = %d-%d-%d",date,month,year);
	}
	else {
			printf("Invalid  date\n");
		}
		
	return 0;
}
void  LeapYear(int year){
		if(year%4==0)
		{
			printf("leap year\n");
		}
		else if(year!=0){
			printf("not  leap year\n");
		}
	}