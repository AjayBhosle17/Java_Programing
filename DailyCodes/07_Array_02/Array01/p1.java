import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{
	
		System.out.println("Enter array Size: ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int size=Integer.parseInt(br.readLine());

		System.out.println("Enter Array Elements: ");

		int arr[]=new int[size];

		int sum=0;
		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==1){

				sum=sum+arr[i];
			}
		}

		System.out.println("Sum of odd number is = "+ sum);
	}
}
