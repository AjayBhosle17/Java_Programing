class Demo{

	void m1(Object str3){
	
		System.out.println(str3);
	}
	void m1(String str){
	
		System.out.println(str);
	}

/*	void m1(Object str1){
	
		System.out.println(str1);
	}*/

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.m1("Mayur");

	}
}
