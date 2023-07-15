class Demo{

	public static void main(String [] args){
	
		StringBuffer str1=new StringBuffer("Ajay");

		System.out.println(str1.reverse());

		String str2="Bhosle";

		StringBuffer str3=new StringBuffer(str2);

		str2=str3.reverse().toString();

		System.out.println(str3);
	}
}
