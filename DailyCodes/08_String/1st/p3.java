
class Demo{

	public static void main(String [] args){
/*	
		StringBuffer sb1=new StringBuffer("Ajay");
		
		System.out.println(sb1.capacity());

		System.out.println(sb1.append("Bhosle"));
		System.out.println(sb1.capacity());
*/
		String str1="c2w";
		String str2=new String("c2w");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		str2=str2.intern();
		System.out.println(System.identityHashCode(str2));

	}
}
