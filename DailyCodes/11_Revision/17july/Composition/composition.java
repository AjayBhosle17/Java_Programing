class Parent{

	int x=10;
	static int y=20;

	void m1(){
	
		System.out.println("Non static m1");
	}

	static void m2(){
	
		System.out.println("static void m2");
	}
}

class Child{

	Parent obj=new Parent();
}

class Client{

	public static void main(String [] args){
	
		Child obj=new Child();

		System.out.println(obj.obj.x);
		System.out.println(obj.obj.y);
		obj.obj.m1();
	}

}
