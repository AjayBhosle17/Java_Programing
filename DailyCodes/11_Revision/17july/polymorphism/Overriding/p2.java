class Parent{

	void marry(){
	
		System.out.print("Priyanka");
	}

	void property(){
	
		System.out.println("Money,gold");
	}
}

class child extends Parent{

	void marry(){
	
		System.out.println("Vaishnavi");
	}
}

class client{

	public static void main(String [] args){
	
		child obj=new child();

		obj.marry();
		obj.property();
	}
}

