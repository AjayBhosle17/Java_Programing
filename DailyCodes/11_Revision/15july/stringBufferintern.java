class Demo{

	public static void main(String [] args){
	
		String str="Ajay";
		String str1="Bhosle";

		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));

		str1=str1.intern();
		System.out.println(System.identityHashCode(str1));
	
	}
}
