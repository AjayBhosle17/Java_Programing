import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		InputStreamReader isr =new InputStreamReader(System.in);

		int x=isr.read();

		System.out.println(x);

		isr.close();               

      		int y = isr.read();

		System.out.println(y);
	}
}

/*

Output:
 
1
49
10
 
4
52
10
 
23
50
51
 
6787654
54
55

csn
99
115

w
119
10

*/

