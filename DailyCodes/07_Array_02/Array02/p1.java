
import java.util.*;

class Demo{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size ");

		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("elements are ");
		
		int sum=0;
		for(int i=0;i<arr.length;i++){
		
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}

		System.out.println("sum is "+ sum);
	}

}
