import java.util.*;

class Demo{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter rows: ");

		int x=sc.nextInt();
	
		System.out.println("Enter cols: ");
		
		int y=sc.nextInt();

		int arr[][]=new int[][]{{1,2,3},{4,5,6}};

		for(int i=0;i<x;i++){

			for(int j=0;j<y;j++){

				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter after Elements: ");

		for(int i=0;i<x;i++){

			for(int j=0;j<y;j++){

		
				System.out.print(arr[i][j] +" ");
			}

			System.out.println("\n");
		
		}
	

	}
}
