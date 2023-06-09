import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		int cnt=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Number : ");

		int x=Integer.parseInt(br.readLine());

		for(int i=1;i<=x;i++){
		
			
			if(x%i==0){
			
				cnt++;
			}
		}	
			if(cnt==2){
			
				System.out.println(x +" is prime number");
			
			}else{
			
				System.out.println(x +" is not prime number");
			
			}
		
	}
}
