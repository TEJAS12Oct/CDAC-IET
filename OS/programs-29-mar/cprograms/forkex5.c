#include<stdio.h>
#include<unistd.h>

void main()
{
	int pid;

	pid = fork();
	if(pid > 0)
	{
		pid = fork();
		if(pid > 0 )
			printf("hello");
		else
			printf("Hi");
	}
	else
	{
		printf("hello");
	}

}
