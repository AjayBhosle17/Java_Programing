class Parent{

	Parent(){
	
		System.out.println("Parent Constructor");
	}
	void Marry(){
	
		System.out.println("Priyanka Chopra");
	}

	void property(){
	
		System.out.println("gold Money");
	}
}

class Child extends Parent {

	Child(){
	
		System.out.println("Child Constructor");
	}
	void Marry(){
	
		System.out.println("Hruta Durgale");
	}

	void fun(int x){
	
		System.out.println(x);
	}

}

class Client{

	public static void main(String [] args){
	
		Child obj=new Child();
		obj.Marry();
		obj.property();
		obj.fun(10);
	}
}

/*
Output:

Parent Constructor
Child Constructor
Hruta Durgale
gold Money
	
 */
