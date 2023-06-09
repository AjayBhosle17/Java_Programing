import java.io.*;

class Demo{

	static int mystrlen(String str1){
	
		char[] arr1=str1.toCharArray();
		
		int cnt=0;
		for(int i: arr1){
		
			cnt++;
		}
		
		return cnt;
	}
	
	static int mycompstr(String str1 , String str2){
	
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		int asciiDiff=0;
		int len1=mystrlen(str1);
		int len2=mystrlen(str2);
		if(len1==len2){

			for(int i=0;i<arr1.length;i++){
		
				if(arr1[i]!=arr2[i]){
				
					asciiDiff=arr1[i]-arr2[i];
					break;
				}
			}
		}else{
		
			asciiDiff=len1-len2;
		}

		return asciiDiff;
	}	


	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String 1: ");
		String str1=br.readLine();
		
		System.out.print("Enter String 2: ");
		String str2=br.readLine();

		int diff=mycompstr(str1,str2);

		if(diff==0){
		
			System.out.println("String are Same");
		}else{

			System.out.println("Difference of string is: "+ diff);
		}
	}
	
}
