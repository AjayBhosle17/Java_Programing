class Demo{

	public static void  main(String [] args){
	
		int arr[][]=new int [3][];

		int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]=new int [2][];
		int arr3[][][]=new int [11][1][];

		for(int i=0;i<arr1.length;i++){
		
			for(int j=0;j<arr1.length;j++){
			
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}

		int arr4[][]=new int [][]{{1},{3,4}};

		for(int i=0;i<arr4.length;i++){
		
			for(int j=0;j<arr4.length;j++){
			
				System.out.print(arr4[i][j]+ " ");
			}

			System.out.println();
		}
	}
}
