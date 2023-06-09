import java.util.StringTokenizer;

class Demo{

	public static void main(String[]args){
	
		StringTokenizer st=new StringTokenizer("my,name,is,ajay,bhosle");

		System.out.println("Next token is: "+st.nextToken(","));//one time la aikch ghety
		System.out.println("Next token is: "+st.nextToken());//all akdach ghety
	}
	
	
}
