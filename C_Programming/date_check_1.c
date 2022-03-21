// Date check  is  valid


#include<stdio.h>
int main()
{
	int date,month,year;
	
	printf("Enter the Date = ");;
	scanf("%d",&date);
	
	printf("Enter the Month = ");
	scanf("%d",&month);
	
	printf("Enter the year = ");
	scanf("%d",&year);
	
	if(31>=date){
		printf("date = %d\n",date);
		
		if(12>=month)
		{
			printf("Month = %d\n",month);
			if(1000<=year){
			printf("year = %d\n",year);
		}
		}
		else{
			printf("invalid");
		}
	}
     
	  
	  printf("Valid_date = %d-%d-%d",date,month,year);
	  return 0;

}