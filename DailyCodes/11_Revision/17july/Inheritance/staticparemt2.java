class Parent{

	static {
	
		System.out.println("In Static");
	}
}

class Child extends Parent{

	static {
	
		System.out.println("In child");
	}

}

class client{

	public static void main(String [] args){
	
		Child obj=new Child();
	}
}

