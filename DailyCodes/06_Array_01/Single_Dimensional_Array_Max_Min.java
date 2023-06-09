import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Size of Array: ");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];


		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}

		int max=0,min=arr[0],max_index=0,min_index=0;

		for(int i=1;i<arr.length;i++){
		
			if(max<arr[i]){
			
				max=arr[i];
				max_index=i;
			}
			 if(min>arr[i]){
			
				min=arr[i];
				min_index=i;
			}
		}

		System.out.println("max_Index : " + max_index + "max is "+ max);
		System.out.println("min_Index : " + min_index + "min is "+ min);
	}
}
