import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		char arr[]=new char[5];

		System.out.printf("Enter Array Element ");

		for(int i=0;i<5;i++){
		
		//	arr[i]=Integer.parseInt(br.readLine());
			arr[i]=(char) br.read();
			//br.skip(1);
		}

		System.out.println("Elements Are: ");

		for(int i=0;i<5;i++){
		
			System.out.println(arr[i]);
		}

	}
}
