class parent{

	int x=10;
	static int y=20;

	static void m1(){
	
		System.out.println("In m1");
	}
}

class child extends parent{

	static void m2(){
	
		System.out.println(y);
		System.out.println("m2");
	}

	 void m3(){
	
		System.out.println(x);
		System.out.println("In m3");
	}
}

class client{

	public static void main(String [] args){
	
		child obj=new child();
		obj.m1();
		obj.m3();
		child.m2();
	}
}
