class Demo{

	int x=10;
	private Demo(){
	
		System.out.println("In Constructor");
	
	}
	public static void main(String [] args){
		
			System.out.println("In main");

			Demo obj=new Demo();
		
	}
}
