class Demo{

	public static void main(String [] args){
	
		String str1=new String("Ajay");
		String str2=new String("Bhosle");

		String str3="Ajay";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str2));

		str1.concat(str2);

		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));
	
		System.out.println(str1.concat(str2));	
	}
}
