import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);

                System.out.print(isr.read());
		BufferedReader br=new BufferedReader(isr);

                System.out.println(br.readLine());             

		System.out.print("Enter Roll no: ");

		int ro_no=Integer.parseInt(br.readLine());
		
		System.out.print("Enter Name: ");
		
		String name=br.readLine();
		System.out.print("Enter Charcter: ");


		char ch=(char)br.read();

                System.out.println("Enter Name: "+ name);
		System.out.println("Enter Roll no: "+ro_no);
		System.out.println("Enter Charcter: "+ch);
	}
}

/*
 
output:


*/
