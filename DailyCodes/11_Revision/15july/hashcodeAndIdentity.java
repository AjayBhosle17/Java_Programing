class Demo{

	public static void main(String [] args){
	
		String str1=new String("c2w");
		String str2="c2w";
		String str3="c2w";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		


	}
}
