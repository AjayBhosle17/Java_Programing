#include<stdio.h>

void main(){

	char ch;
	
	printf("Enter the charcter: ");
	scanf("%c",&ch);

	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) ){
	
		if(ch%2==0){
		
			printf("charcter is even:  %d\n",ch);
		}else{
		
			printf("charcter is  not even: %d\n",ch);

		}
	}else{
	
		printf("plz enter Charcter\n");
	}

}
