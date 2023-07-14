import java.util.*;

class Demo{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number: ");

		int x=sc.nextInt();

		int num=x;
		int sum=0;
		for(int i=1;i<=num/2;i++){
		
			if(num%i==0){

				sum=sum+i;
			}

		}

		if(sum==num){
		
			System.out.println("Perfect Number");
		}else{
		
			System.out.println("Not perfect Number");
		}
	}

}
