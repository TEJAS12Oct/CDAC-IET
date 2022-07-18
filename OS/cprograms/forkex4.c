#include<stdio.h>
#include<unistd.h>

void main()
{
	int childpid;

	childpid = fork();
        childpid = fork();
	
	if(childpid == 0)
	{
		printf("hi I am child pid =%d, ppid=%d \n",getpid(),getppid());
		//write code for calculating factorial
	}
	else
	{
		printf("hi I am parent pid =%d, ppid=%d \n",getpid(),getppid());
		//write code to print fibonacci series
	}

}

