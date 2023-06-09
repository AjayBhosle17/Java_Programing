import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("****World Cup****");

		System.out.print("Enter Ranking: ");

		int rank=Integer.parseInt(br.readLine());

		System.out.print("Enter Group name: ");

		char grpName=(char)br.read();

		System.out.println("Team Info");

		System.out.println("Team ranking: "+rank);
		System.out.println("group name: "+grpName);

		br.skip(2); // br.skip(1);

		
		System.out.print("Enter Ranking: ");

		int rank1=Integer.parseInt(br.readLine());

		System.out.println("Team ranking: "+rank1);
	}
}

/*
IMP: jr charcter nunter input integer ghyach asel tr skip()function cha use krne in BufferedReader. 

****World Cup****
Enter Ranking: 1
Enter Group name: AB
Team Info
Team ranking: 1
group name: A
Enter Ranking: 12
Team ranking: 12
ajay@bhosle:~/SelfJava/Input_Output_In_Java/Bufferedreader$ java Demo 
****World Cup****
Enter Ranking: 123
Enter Group name: A
Team Info
Team ranking: 123
group name: A

Enter Ranking: 42
Team ranking: 42
ajay@bhosle:~/SelfJava/Input_Output_In_Java/Bufferedreader$ java Demo 
****World Cup****
Enter Ranking: 12
Enter Group name: B
Team Info
Team ranking: 12
group name: B
3
Enter Ranking: Exception in thread "main" java.lang.NumberFormatException: For input string: ""
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:592)
	at java.lang.Integer.parseInt(Integer.java:615)
	at Demo.main(BufferSkip.java:29)


   
 */





	

