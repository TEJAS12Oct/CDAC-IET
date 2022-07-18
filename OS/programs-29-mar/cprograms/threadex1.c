#include<stdio.h>
#include<unistd.h>
#include<pthread.h>


void editor()
{
      while(1)
       {
		printf("editor runs thid = %ld \n",pthread_self());
		sleep(2);
       }
}
void spellchecker()
{
      while(1)
       {
		printf("spellchecker runs thid = %ld \n",pthread_self());
		sleep(2);
       }
}


void main()
{
/*  single thread model , editor runs and never returns so spellchecker never runs
	editor();
	spellchecker();
	*/

    //multi thread model 
    pthread_t  th1, th2;
    pthread_create(&th1,NULL,(void*)editor,NULL);
    pthread_create(&th2,NULL,(void*)spellchecker,NULL);

   while(1){
   printf("\nmain thread id = %ld running th1=%ld,th2=%ld ",pthread_self(),th1,th2);
   sleep(2);
   }
}//end of main













