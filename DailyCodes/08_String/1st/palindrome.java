import java.util.*;;

class Demo{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number: ");
		int x=sc.nextInt();

		int temp=x;
		int sum=0;
		while(x!=0){
		
			sum=sum*10+ x%10;
			x/=10;
			
		}
		if(sum==temp){
		
		
			System.out.println(temp+" is a palindrome number");
		}else{
		

			System.out.println(temp+" is not a palindrome number");
		}
	}

}
