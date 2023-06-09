import java.io.*;

class Demo{

	public static void main(String[]args)throws Exception{
	
		


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Student name: ");

		String str=br.readLine();


		System.out.print("Enter Student total marks: ");
		int marks=Integer.parseInt(br.readLine());


		System.out.print("Enter Student name first Letter: ");

		char ch=(char)br.read();


		System.out.println("Enter Student name: "+str);
		System.out.println("Enter Student total marks: "+marks);
		System.out.println("Enter Student name first Letter: "+ch);


	}
}
