/*
 * Duplicate case chalt nahi,and 
 * float and Double chalt nahi
 * charcter input in java using bufferReader char choice=(char)br.read();
 */

import java.io.*;
class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number");

		int choice=Integer.parseInt(br.readLine());
		
                
		//char choice=(char)br.read();
		switch(choice){
		
			case 66:
				System.out.println("66");
				break;
			case 'A':
				System.out.println("65");
				break;
			case 2-2:
				System.out.println("3");
				break;
			case 87:
				System.out.println("0");
				break;
			case 10*2:
				System.out.println("-12");
				break;
			default:
				System.out.println("this value is not available");
		}


	}
}
