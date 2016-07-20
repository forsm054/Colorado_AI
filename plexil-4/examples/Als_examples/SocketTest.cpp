#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<unistd.h>
#include<arpa/inet.h>
#include<sys/socket.h>

#define BUFLEN 512 // Maximum length of buffer
#define PORT 8888 // listener port

int main(void)
{
	struct sockaddr_in sin_me, sin_other;
	
	int s, i, slen = sizeof(sin_other), recv_len;
	char buf[BUFLEN];
	
	// create UDP socket
	if ((s=socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) == -1)
	{
		perror("Failed to create socket");
	}
	
	// zero out the structure
	memset((char *) &sin_me, 0, sizeof(sin_me));
	
	sin_me.sin_family = AF_INET;
	sin_me.sin_port = htons(PORT);
	sin_me.sin_addr.s_addr = htonl(INADDR_ANY);
	
	// bind socket to port
	if(bind(s, (struct sockaddr*)&sin_me, sizeof(sin_me)) == -1)
	{
		perror("Failed binding");
	}
	
	// continually listen for data
	while(1)
	{
		printf("Waiting for data...");
		fflush(stdout);
		
		// try to receive some data
		memset(buf, '\0', BUFLEN);
		if((recv_len = recvfrom(s, buf, BUFLEN, 0, (struct sockaddr *) &sin_other, (socklen_t*)&slen)) == -1)
		{
			perror("Failed receiving data");
		}
		
		printf("Received packet from %s:%d\n", inet_ntoa(sin_other.sin_addr), ntohs(sin_other.sin_port));
		printf("Data: %s\n", buf);
		
		//int data = buf[1];
		//data = data + 2;
		//buf[1] = data;
		
		// reply
		if (sendto(s, buf, recv_len, 0, (struct sockaddr*) &sin_other, slen) == -1)
		{
			perror("Failed sending");
		}
	}
	
	// close socket
	close(s);
	return 0;
}
