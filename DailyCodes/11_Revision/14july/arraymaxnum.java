import java.io.*;

class Demo{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");

		int x=Integer.parseInt(br.readLine());

		System.out.println("Enter Elements: ");

		int arr[]=new int[x];
		for(int i=0;i<x;i++){
		
			arr[i]=Integer.parseInt(br.readLine());	
		}

		int max=Integer.MAX_VALUE;
		int max1=0;
		int max2=0;

		for(int i=0;i<arr.length;i++){
		
			if(max<arr[i]){
			
				System.out.println("Invalid Input");
			}
			if(arr[i]>max1){
			
				max2=max1;
				max1=arr[i];
			}
		}

		System.out.println(max2);
	}
}
