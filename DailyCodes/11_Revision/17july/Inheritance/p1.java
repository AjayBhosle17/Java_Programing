class Parent{

	Parent(){
	
		System.out.println("Parent Constructor");
	}

	void property(){
	
		System.out.println("Farm");
	}
}

class Child extends Parent{

	Child(){
	
		System.out.println("Child Constructor");
		
	}
	static{
	
		System.out.println("Hello");
	}

	void m2(){
	
		System.out.println("Money");
	}
}

class client{

	public static void main(String [] args){
	
		Child obj=new Child();
		obj.property();
		obj.m2();
	}
}


