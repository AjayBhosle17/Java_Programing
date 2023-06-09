
class Demo{

	static Demo obj=new Demo();

	private Demo(){
	

	}
	static Demo methodCreate(){
	
		return obj;
	}
}

class CreateObj{

	public static void main(String [] args){
	
		Demo ret1=Demo.methodCreate();
		System.out.println(System.identityHashCode(ret1));

	}
}
