import java.util.*;

class Demo{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter two Number: ");

		int x=sc.nextInt();
		int y=sc.nextInt();

		System.out.print("Enter Sir Name:  ");
		String c=sc.next();

		System.out.println("Vivek"+ " "+ c);

		System.out.print("Enter Charcters: ");
		char ch=sc.next().charAt(0);

		System.out.println(x+y);
		System.out.println("vivek first letter *"+ ch +"*");
           
		System.out.print("Enter 10th Total Marks: ");
		int x1=sc.nextInt();

		System.out.println("Total marks is: "+x1);

	}
}
