#include<stdio.h>
#include<unistd.h>

void main()
{

	int pid,x=0;
        char * args[] ={"ls","/home",NULL};
	pid = fork();
	if(pid > 0 )
	{
		while(x++<10)
		 {
		  printf("\nhi from parent pid=%d",getpid());
		  //sleep(2);
		}
	}
	else
	{
		//execl("./hello","./hello",NULL);
		//execvp("ls",args);
                execlp("ls","ls","/home",NULL);
	}

}
