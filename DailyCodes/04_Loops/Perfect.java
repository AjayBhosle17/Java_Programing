import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		int sum=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Number : ");

		int x=Integer.parseInt(br.readLine());

		for(int i=1;i<x;i++){
		
			
			if(x%i==0){
			
				sum+=i;
			}
		}	
		System.out.println(sum);	
		if(x==sum){
			
				System.out.println(x +" is Perfect number");
			
			}else{
			
				System.out.println(x +" is not Perfect number");
			
			}
		
	}

}
