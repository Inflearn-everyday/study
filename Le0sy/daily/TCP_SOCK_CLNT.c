// client
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <sys/socket.h>

void error_handling(char * message);

int main(int argc, char* argv[])
{
        char *msg = malloc(sizeof(char) * 128);

        int clnt_sock, RCV;
        clnt_sock=socket(PF_INET, SOCK_STREAM, 0);
        if(clnt_sock == -1)
                error_handling("socket error");
        printf("create socket\n");

        struct sockaddr_in serv_addr;
        memset(&serv_addr, 0, sizeof(serv_addr));
        serv_addr.sin_family = AF_INET;
        serv_addr.sin_port = htons(atoi(argv[2]));
        serv_addr.sin_addr.s_addr= inet_addr(argv[1]);

        if(connect(clnt_sock, (struct sockaddr*) &serv_addr, sizeof(serv_addr))==-1)
                error_handling("connect error");
        printf(" --- connection ---\n\n\n\n");

        while(1) {
                recv(clnt_sock, msg, 128, 0);
                if(strcmp(msg, "exit") == 0) {
                        close(clnt_sock);
                        return 0;
                }
                printf("recv >> %s\n", msg);
                printf("send >> ");
                scanf("%s", msg);
                write(clnt_sock, msg, 128);
        }
}

void error_handling(char *message)
{
        fputs(message,stderr);
        fputc('\n', stderr);
        exit(1);
}
