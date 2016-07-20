#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<arpa/inet.h>
#include<sys/socket.h>

#define SERVER "127.0.0.1"
#define BUFLEN 512
#define PORT 8033

int main(void)
{
	struct sockaddr_in sin_other;
	int s, i, slen=sizeof(sin_other);
	char buf[BUFLEN];
	int message[BUFLEN];
	
	if((s=socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) < 0)
	{
		perror("Socket");
	}
	
	memset((char *) &sin_other, 0, sizeof(sin_other));
	sin_other.sin_family = AF_INET;
	sin_other.sin_port = htons(PORT);
	
	if(inet_aton(SERVER, &sin_other.sin_addr) == 0)
	{
		perror("inet_aton() failed\n");
	}
	
	while(1)
	{
		printf("Enter Message: ");
		scanf("%d",message);
		
		// send message
		if(sendto(s,message, sizeof(message), 0, (struct sockaddr *) &sin_other, slen) < 0)
		{
			perror("sendto()");
		}
		
		// receive a reply and print it
		// clear the buffer
		memset(buf, '\0', BUFLEN);
		// try to receive some data, this is a blocking call
		if(recvfrom(s, buf, BUFLEN, 0, (struct sockaddr *) &sin_other, &slen) < -1)
		{
			perror("recvfrom()");
		}
		
		puts(buf);
	}
	
	close(s);
	return 0;
}
