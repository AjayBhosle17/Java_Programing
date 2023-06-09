import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Size of array: ");

		int x=Integer.parseInt(br.readLine());

                char chr[]=new char[x];
	
		System.out.println("Enter Elements: ");
	
		for(int i=0;i<chr.length;i++){
		
                         chr[i]=(char)br.read();
			 
			 br.skip(1);
		}

		for(int i=0;i<chr.length;i++){
		
			System.out.println(chr[i]);
			
		}
	}
}
