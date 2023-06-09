import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size: ");
                
		int x=Integer.parseInt(br.readLine());

		int arr[]=new int[x];

		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
		
		}
 
		System.out.println("Odd Numbers: ");
		
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]%2==1){

			
				System.out.println(arr[i]);
			
			}   
		}		
	}
}
