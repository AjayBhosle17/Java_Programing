import java.io.*;
class Demo{

	public static void main(String [] args){
	
		System.out.println("Enter String");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str1=null;
		try{

			 str1=br.readLine();
		}catch(IOException sc){
		
			System.out.println("Bhau");
		}

		char[] arr=str1.toCharArray();

		int start=0;
		int end=arr.length-1;

		while(start<end){
		
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;

			start++;
			end--;
		}

		String str11=new String(arr);

		System.out.println(arr);
	}
}
