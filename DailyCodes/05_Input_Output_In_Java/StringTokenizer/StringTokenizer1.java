import java.util.StringTokenizer;
import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                
		System.out.println("Enter ur whole name...?");
		String str=br.readLine();

		StringTokenizer st=new StringTokenizer(str," ");

		String token1=st.nextToken();
		String token2=st.nextToken();
		String token3=st.nextToken();

		System.out.println(token1);
		System.out.println(token2);
		System.out.println(token3);
		
	}
}
