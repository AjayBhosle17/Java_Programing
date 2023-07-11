class Parent{

	static int x=10;
	static{
	
		System.out.println("Static block");
		System.out.println(x++);
	}
	Parent(){
	
		System.out.println("Parent Constructor");
		System.out.println(x+10);
	}
	

}

class Child extends Parent{

	
	static{
	
		System.out.println("Static block-2");
		System.out.println(x);
	}

	Child(){
	
		super();
		System.out.println("Child Constructor");
		System.out.println(x);
	}
	
	static{
	
		System.out.println("Static block-3");
		System.out.println(x);
	}

}

class Client{
	
	public static void main(String [] args){

		Child obj=new Child();
	}
}
