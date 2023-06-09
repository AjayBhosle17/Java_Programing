import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size: ");

		int x=Integer.parseInt(br.readLine());

		char chrr[]=new char[x];

		System.out.print("Enter Charcters: ");

		for(int i=0;i<x;i++){
		
			chrr[i]=(char)br.read();
			br.skip(1);

		}
                 
		System.out.println("Even Charcter : ");
	    	for(int i=0;i<x;i++){
		
			if(chrr[i]%2==0){
			
				System.out.println(chrr[i]);
			}
		}
	}
}
