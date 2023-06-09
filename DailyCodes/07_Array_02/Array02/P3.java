// Sum of even odd

import java.io.*;

class Demo{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size: ");

		int size=Integer.parseInt(br.readLine());

		System.out.println("Enter Elements ");
	
		int arr[]=new int[size];
		
		int sum=0;
		int sum1=0;

		for(int i=0;i<size;i++){
			
			arr[i]	=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
			
				sum=sum+arr[i];
			}else{
			
				sum1=sum1+arr[i];
			}

		}

		System.out.println("sum of even Numbers = "+ sum);
		System.out.println("sum of odd Numbers  = "+ sum1);
	}
}
