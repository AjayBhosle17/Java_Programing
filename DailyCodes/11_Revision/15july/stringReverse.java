class Demo{

	public static void main(String [] args){
	
		String str1="Ajay";
		
		char arr[]=str1.toCharArray();


		int start=0;
		int end=arr.length-1;

		while(end>start){
		
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;

			end--;
			start++;
		}

		String str2=new String(arr);

		System.out.println(str2);
	}
}
