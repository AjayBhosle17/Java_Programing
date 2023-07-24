class Demo{

	private Demo(){
	
	}

	static Demo obj=new Demo();

	static  Demo methodDemo(){
	
		return obj;
	}

	public static void main(String [] args){
	
		Demo obj=new Demo();
		System.out.println(obj.methodDemo());
		
		Demo obj1=new Demo();
		System.out.println(obj1.methodDemo());
		
		Demo obj2=new Demo();
		System.out.println(obj2.methodDemo());
	}
}
