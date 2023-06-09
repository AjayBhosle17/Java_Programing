import java.io.*;
import java.util.StringTokenizer;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Whole Collage name: ");

		String str=br.readLine();

		StringTokenizer st=new StringTokenizer(str," ");

		String str1=st.nextToken();
		String str2=st.nextToken();
		String str3=st.nextToken();
		String str4=st.nextToken();

		System.out.println("Collage name nextToken is "+str1);
		System.out.println("Collage name nextToken is "+str2);
		System.out.println("Collage name nextToken is "+str3);
		System.out.println("Collage name nextToken is "+str4);



	}
}
