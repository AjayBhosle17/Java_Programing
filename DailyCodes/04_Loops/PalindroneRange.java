import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter Starting range : ");

			int start=Integer.parseInt(br.readLine());

			System.out.print("Enter Ending range : ");
			
			int end=Integer.parseInt(br.readLine());
	

                        int temp,rem,rev=0;
			for(int i=start;i<=end;i++){

				temp=i;

				while(temp>0){
				
					rem= temp % 10;
				        rev=rev*10 + rem;
				        temp=temp/10;
				
				}
				
				if(rev==i){
				
					System.out.print(i +" ");
				}
				rev= 0;
			}
				

	}

}
