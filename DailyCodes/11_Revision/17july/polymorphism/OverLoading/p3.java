class Demo{

	private Demo(){
	
	}

	static Demo obj=new Demo();

	static Demo fun(){
	
		return obj;
	}
	public static void main(String [] args){
	
		Demo obj1=new Demo();
		System.out.println(obj1.fun());
		
		Demo obj2=new Demo();
		System.out.println(obj2.fun());


	}
}
