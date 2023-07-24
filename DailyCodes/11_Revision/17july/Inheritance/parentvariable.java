class Parent{

	int x=10;
	static int y=20;

	Parent(){
	
		System.out.println("In Parent");
	}

}

class Child extends Parent{

	int x=30;
	static int z=30;

	Child(){
	
		System.out.println("In Child");
	}

	void m1(){
	
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(Parent.y);
		System.out.println(x);
		System.out.println(z);
	}
}

class client{

	public static void main(String [] args){
	
		Child obj=new Child();
		obj.m1();
	}
}
