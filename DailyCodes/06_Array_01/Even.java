import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*System.out.print("Enter Size of Array: ");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];


		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
		*/
		System.out.print("Enter Size: ");

		int x=Integer.parseInt(br.readLine());

		int arr[]=new int[x];

		for(int i=0;i<x;i++){
		
		      arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<x;i++){
		
			if(arr[i]%2==0){

				System.out.println(arr[i] + " ");
			}
		}
	}
}
