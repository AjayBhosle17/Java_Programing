import java.util.*;
import java.io.*;

class Demo{

	public static void main(String[]args){
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str5=null;
		try{

			str5=br.readLine();
	
		}catch(IOException st){
		

		}

		System.out.println(str5);
		
		StringTokenizer st=new StringTokenizer(str5," ");

		String str1=st.nextToken();
		String str2=st.nextToken();
		String str3=st.nextToken();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1);

	}
}
