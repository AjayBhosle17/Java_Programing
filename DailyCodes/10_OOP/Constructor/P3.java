

class Demo{
	
	int x=10;

	Demo(){

		System.out.println("In Demo");
		System.out.println(x);
	}

	Demo(int x){
	
		System.out.println(x);
	}

	Demo(Demo y){
	
		System.out.println("Hello Dear");
	}

	public static void main(String[]args){
	
		Demo obj1=new Demo();
		Demo obj2=new Demo(10);
		Demo  obj3=new Demo(obj1);
	}
}
