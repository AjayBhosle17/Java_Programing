import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the limit : ");

		int x=Integer.parseInt(br.readLine());

		for(int i=1;i<=x;i++){
			int sum=0;
			for(int j=1;j<i;j++){
			
				if(i%j==0){
				
					sum+=j;
				}

			}	
			
		                  if(i==sum){
					  
					  System.out.println(i + " ");
				  }
			
		}
		
	}

}
