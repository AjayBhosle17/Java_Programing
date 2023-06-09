class Demo{

	public static void main(String [] args){
	
		String str1=new String("Ajay");

		String str2="Ajay";

		String str3="Aja";
		String str4=new String();

		//System.out.println(System.identityHashcode(str1));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
