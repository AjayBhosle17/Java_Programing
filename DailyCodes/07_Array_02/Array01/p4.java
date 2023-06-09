import java.io.*;

class Demo{

	public static void main(String[]  args )throws IOException{
	
		System.out.println("Enter array Size: ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int size=Integer.parseInt(br.readLine());

		System.out.println("Enter charcter Array Elements: ");

	
		char arr[]=new char[size];

		for(int i=0;i<arr.length;i++){
		
			arr[i]=(char)br.read();
			
			br.skip(1);
		}
		
		for(int i=0;i<arr.length;i++){

			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
			
				System.out.print(arr[i] + " ");
			}	
				
		}
		
	}
}
