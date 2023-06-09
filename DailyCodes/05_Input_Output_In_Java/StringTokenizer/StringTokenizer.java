import java.util.StringTokenizer;

import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		//System.out.println("Enter ");
		
		StringTokenizer st=new StringTokenizer("hi,hello,myself,ajay");

	//	System.out.println("next Token is "+ st.nextToken());//if  nextToken(",")nahi likha to all token print
		
		System.out.println("next token is "+st.nextToken(","));

	}
}
