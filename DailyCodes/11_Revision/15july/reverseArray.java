class Demo{

	public static void main(String [] args){
	
		int arr[]=new int[]{10,20,30,-34,92};


		int start=0;
		int end=arr.length-1;

		for(int i=arr.length-1;i>=0;i--){
		
			System.out.println(arr[i]);
		}

		System.out.println("\nTwo Way\n\n");
		while(start<end){
		
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}

		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);

		}



	}
}
