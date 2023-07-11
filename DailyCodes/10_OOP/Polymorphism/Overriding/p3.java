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
	
		Parent obj=new Child();
		obj.Marry();
		obj.property();
		obj.fun(10);
	}
}


// if obj is Child class then no problem if u want o/p then child fun copy in Parent class code properly work....

/*
Output:

Parent Constructor
Child Constructor
Hruta Durgale
gold Money
10	
 */
