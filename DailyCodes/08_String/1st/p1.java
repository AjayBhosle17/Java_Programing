class Demo{

	public static void main(String [] args){
	
		String str1="Ajay";
		String str2="Ajay";
/*
		String str3=new String("Ajay");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));

		if(str3==str2){
		
			System.out.println("Equal");
		}else{
		
			System.out.println(" not Equal");
		}
*/
		String  str4=str1+str2;
		String str5="AjayAjay";

		String str6=str1.concat(str2);
		
	//	System.out.println(System.identityHashCode(str4));
	//	System.out.println(System.identityHashCode(str5));
	//	System.out.println(System.identityHashCode(str6));
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}
