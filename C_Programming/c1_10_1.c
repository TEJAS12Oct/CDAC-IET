// 10.accept max  3 three number

#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Entre the three no");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a>b){
		if(a>c){
			printf("max= %d",a);
		}
		else{
			printf("max= %d",c);
		}
	}
	else{
		if(b>c){
			printf("max= %d",b);
		}
		else{
			printf("max= %d",c);
		}
	
	}
	return 0;
}