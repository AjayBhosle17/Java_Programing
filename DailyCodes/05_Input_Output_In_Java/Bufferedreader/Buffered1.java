import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);

	//	BufferedReader br=new BufferedReader(isr);

                System.out.println("Enter Number: ");
		System.out.println(isr.read());

	}
}

/*
 
output:
Enter Number: 
12
49

Enter Number: 
09876637
48
 
Enter Number: 
Dss
68
 
Enter Number: 
fvdkujkjhb
102
 
Enter Number: 
/zlc
47
 
Enter Number: 
@
64


*/

