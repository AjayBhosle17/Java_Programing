import java.util.*;

class Demo{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Starting Range:  ");

		int x=sc.nextInt();
		
		System.out.print("Enter Ending Range:  ");

		int y=sc.nextInt();

		while(x<=y){
		
			 int temp=x;
			int sum=0;
			while(x!=0){
			
				sum=sum*10+x%10;
				x/=10;

			}
			if(temp==sum){
			
				System.out.print(temp+" ");
			}
			x=temp;
			x++;
		}
	}
}
