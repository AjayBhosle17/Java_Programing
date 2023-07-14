import java.io.*;
class Demo{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader br=new InputStreamReader(System.in);

		try{

			int x=br.read();
			System.out.println(x);
			br.close();
		}catch(IOException sc){
		
		}

		
	br.close();
		try{

			br.close();
			int y=br.read();
			System.out.println(y);
		}catch(IOException sc){
		
		}
	br.close();
			int z=br.read();
			System.out.println(z);

	}

}
