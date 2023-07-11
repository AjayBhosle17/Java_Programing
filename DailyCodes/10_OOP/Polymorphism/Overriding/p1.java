class Parent{

	void Marry(){
	
		System.out.println("Priyanka Chopra");
	}

	void property(){
	
		System.out.println("gold Money");
	}
}

class Child extends Parent{

	void Marry(){
	
		System.out.println("Hruta Durgale");
	}

}

class Client{

	public static void main(String [] args){
	
		Child obj=new Child();
		obj.Marry();
		obj.property();
	}
}
