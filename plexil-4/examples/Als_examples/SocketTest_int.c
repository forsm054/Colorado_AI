#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<arpa/inet.h>
#include<sys/socket.h>

#define BUFLEN 512 // Maximum length of buffer
#define PORT 8032 // listener port

int main(void)
{
	struct sockaddr_in sin_me, sin_other;
	
	int s, i, slen = sizeof(sin_other), recv_len;
	int buf[BUFLEN];
	
	// create UDP socket
	if ((s=socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) < 0)
	{
		perror("Failed to create socket");
	}
	
	// zero out the structure
	memset((char *) &sin_me, 0, sizeof(sin_me));
	
	sin_me.sin_family = AF_INET;
	sin_me.sin_port = htons(PORT);
	sin_me.sin_addr.s_addr = htonl(INADDR_ANY);
	
	// bind socket to port
	if(bind(s, (struct sockaddr*)&sin_me, sizeof(sin_me)) < 0)
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
		if((recv_len = recvfrom(s, buf, BUFLEN, 0, (struct sockaddr *) &sin_other, &slen)) < 0)
		{
			perror("Failed receiving data");
		}
		
		printf("Received packet from %s:%d\n", inet_ntoa(sin_other.sin_addr), ntohs(sin_other.sin_port));
		//int data_int;
		//sscanf(buf, "%d", &data_int);
		//printf("Data: %d\n", buf);
		//printf("Data: %s\n", buf);
		
		int i;
		for(i=0;i<6;i++) {
			printf("Data: %d\n", buf[i]);
		}
		
		//int data = buf[1];
		//data = data + 2;
		//buf[1] = data;
		
		// reply
		if (sendto(s, buf, recv_len, 0, (struct sockaddr*) &sin_other, slen) < 0)
		{
			perror("Failed sending");
		}
	}
	
	// close socket
	close(s);
	return 0;
}
