class Parent{

	static int x=10;
	int i=10;
	static{
	
		System.out.println(x);
	}
	Parent(){
	
		System.out.println("11");
		System.out.println(i);
	}
	{
	
		System.out.println("12");
	}

	Object fun(){
	
		System.out.println("Obj fun");
		return "Ajay";
	}	
}

class Child extends Parent{

	Child(){
		
		super();	
		System.out.println("Child");
	}
	static{
	
		System.out.println("In static");
	}


}

class Client{

	public static void main(String [] args){
	
		Child obj=new Child();
	}
}
