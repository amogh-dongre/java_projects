#include<stdio.h>
#include<sys/wait.h>
#include<unistd.h>

int main()
{
if(fork() == 0){
    fork();
}

printf("hello\n");
return 0;
}
