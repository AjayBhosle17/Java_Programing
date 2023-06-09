class Demo{

	int x=10;
	static int y=20;
	static int z=30;
	static String aa="Hello";
	static String ab=new String("Sir");
	static {
	
		System.out.println("In static");
	
	}
	static void fun(){
	
	
		System.out.println("In fun");
	}

	public static void main(String []args){
	
		fun();

	}
}
