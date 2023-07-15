class Demo{

	static Demo obj=new Demo();

	private Demo(){
	
		
	}	

	static Demo MethodCreate(){
	
		return obj;
	}
}

class client{

	public static void main(String [] args){
	
		Demo ret1=Demo.MethodCreate();
		System.out.println(ret1);
		Demo ret2=Demo.MethodCreate();
		System.out.println(ret2);
		Demo ret3=Demo.MethodCreate();
		System.out.println(ret3);
	}
}
