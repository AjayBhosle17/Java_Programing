import java.io.*;
class Demo{

	public static void main(String []args)throws IOException{
	
		
		System.out.println("Enter value: ");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
		int x=Integer.parseInt(br.readLine());
             // x=5;

		System.out.println(++x + ++x); //13
		System.out.println(x);         //7

		System.out.println(--x + x++ );   //12
		System.out.println(++x + x++);   //16
		System.out.println(++x + x--);   //20
		System.out.println(x-- + ++x);   //18
	}

}
