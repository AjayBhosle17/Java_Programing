import java.util.*;

class Demo{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Name: ");

		String str=sc.next();

		System.out.print("Enter 1st Letter: ");

		char ch=sc.next().charAt(0);

		System.out.print("Enter how many gf: ");

		int x=sc.nextInt();

		System.out.print("1st gf name : ");

		String x1=sc.next();
		System.out.print("2nd gf name : ");

		String x2=sc.next();

		System.out.println("Enter Student name "+ str);
		System.out.println("Enter Enter 1st Letter "+ ch);
		System.out.println("Enter how many gf "+ x);
		System.out.println("1st gf name is "+x1);
		System.out.println("2nd gf name is "+x2);
		System.out.println("True Love  gf name is "+x1);

	}
}
