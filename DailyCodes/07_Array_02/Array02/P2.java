// Even And Odd Integer

import java.util.*;

class Demo{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array Size ");

		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("elements are ");
		
		int cnt=0,cnt1=0;
		for(int i=0;i<arr.length;i++){
		
			arr[i]=sc.nextInt();

			if(arr[i]%2==0){
			
				cnt++;
			}else{
			
				cnt1++;
			}
		
		}

		System.out.println("number of even Numbers = "+ cnt);
		System.out.println("number of odd Numbers  = "+ cnt1);
	}

}
