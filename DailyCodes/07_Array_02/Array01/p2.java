import java.io.*;

class Demo{

	int a;
	public static void main(String[] args)throws IOException{
	
		System.out.println("Enter array Size: ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int size=Integer.parseInt(br.readLine());

		System.out.println("Enter Array Elements: ");

		int arr[]=new int[size];

		int prod=1;
		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
			
			if(arr[i]%2==0){
				
				prod=prod*arr[i];

			}
		}

		System.out.println("product of even number is = "+ prod);
	}
}
