import java.io.*;

class Demo{

	static int mylength(String str){
	
		char[] arr=str.toCharArray();

		int count=0;
		for(int i : arr){
		
			count++;
		}
		return count;
	}

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String: ");
		String str1=br.readLine();

		int cnt=mylength(str1);

		System.out.println("length of string is: "+ cnt);
	}
}
