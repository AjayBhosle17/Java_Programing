import java.io.*;
class Demo{

	public static void main(String[]args)throws IOException{
	
		
		System.out.print("Enter Enter : ");

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int num=Integer.parseInt(br.readLine());

		int temp=num,x;
	        int rem,fact=1,sum=0;
		
		while(temp!=0){
		
			rem=temp%10;
			x=1;
			fact=1;

			while(rem>=x){
			
				fact=fact*x;
				x++;
			}
			         sum+=fact;
				 temp=temp/10;

		}if(sum==num){
		
			System.out.println(num +" is strong number.");
		}else{
		
			System.out.println(num +" is not  strong number.");

		}
                      	
	}
}
