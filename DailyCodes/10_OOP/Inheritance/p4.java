class Parent{

	int x=10;

	int Demo1(){
	
		return x;
	}
}

class Child extends Parent{

	int x=20;
}

class Client extends Child{

	int x=30;

	void access(){

		Child obj1=new Child();
		int y=super.Demo1();	
		System.out.println(y);
	}

}

class Demo{
	
	public static void main(String [] args){
	
		Client obj=new Client();

		obj.access();
	}


}
