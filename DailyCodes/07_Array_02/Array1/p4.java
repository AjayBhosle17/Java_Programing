class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{1,2,3,4};
		int arr1[]={10,200,3,4,5};

		System.out.println(System.identityHashCode(arr[0]));

		System.out.println(System.identityHashCode(arr1[0]));

		System.out.println(arr);
		System.out.println(arr1);
	}
}
