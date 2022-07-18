#include<stdio.h>
#include<unistd.h>

void main()
{
    int pid;
    pid = fork();
    if(pid>0)
    {
	printf("i am parent pid=%d ppid=%d\n",getpid(),getppid());
	sleep(1);
	printf("parent terminating\n");
    }
    else
    {
	printf("i am child pid=%d ppid=%d\n",getpid(),getppid());
	sleep(4);
	printf("i am child pid=%d ppid=%d\n",getpid(),getppid());
    }

}
