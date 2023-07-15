class Demo{

	
	public static void main(String [] args){
	
		int arr[]=new int[]{9,-3,2,4,5};

		int max=Integer.MIN_VALUE;
		int Secondmax=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				Secondmax=max;
				max=arr[i];
			}else if(arr[i]>Secondmax && arr[i]!=max){
			
				Secondmax=arr[i];
			}
		}

		System.out.println(max);
		System.out.println(Secondmax);
	}
}
