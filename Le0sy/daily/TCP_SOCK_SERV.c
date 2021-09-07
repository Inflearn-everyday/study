// server
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <sys/socket.h>

void error_handling(char * message);

int main(int argc, char* argv[])
{
        int serv_sock;
        int clnt_sock;

        struct sockaddr_in serv_addr;
        struct sockaddr_in clnt_addr;
        socklen_t clnt_addr_size;

        char *msg = malloc(sizeof(char) * 128);

        serv_sock=socket(PF_INET, SOCK_STREAM, 0);
        if(serv_sock == -1)
                error_handling("socket error");
        printf("create socket\n");

        memset(&serv_addr, 0, sizeof(serv_addr));
        serv_addr.sin_family=AF_INET;
        serv_addr.sin_addr.s_addr=htonl(INADDR_ANY);
        serv_addr.sin_port=htons(atoi(argv[1]));

        if(bind(serv_sock, (struct sockaddr*) &serv_addr, sizeof(serv_addr))==-1)
                error_handling("bind error");
        printf("binding socket\n");

        if(listen(serv_sock, 5)==-1)
                error_handling("listen error");

        clnt_addr_size = sizeof(clnt_addr);
        clnt_sock=accept(serv_sock, (struct sockaddr*)&clnt_addr, &clnt_addr_size);
        if(clnt_sock==-1)
                error_handling("accept error");
        printf(" --- connection ---\n\n\n\n\n");

        while(1) {
                printf("send >> ");
                scanf("%s", msg);
                if(strcmp(msg, "exit") == 0) {
                        printf("exit\n");
                        break;
                }
                if(write(clnt_sock, msg, 128) == -1) {
                        error_handling("write error");
                        break;
                }
                printf("recv >> ");
                recv(clnt_sock, msg, 128, 0);
                printf("%s\n", msg);
        }

        write(clnt_sock, "exit", 128);
        close(clnt_sock);
        close(serv_sock);

        return 0;
}

void error_handling(char *message)
{
        fputs(message,stderr);
        fputc('\n', stderr);
        exit(1);
}
