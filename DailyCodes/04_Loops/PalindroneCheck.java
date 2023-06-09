import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		System.out.print("Enter Number: ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int x=Integer.parseInt(br.readLine());

                int temp=x,rem,rev=0;
		//System.out.println(x%10);
		//System.out.println(x/10);

		while(x!=0){
		 
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}

		if(rev==temp){
			
			System.out.println(temp +" is Palindrone Number");

		
		}else{
		
			System.out.println(temp +" is not  Palindrone Number");

		}
	}
}
