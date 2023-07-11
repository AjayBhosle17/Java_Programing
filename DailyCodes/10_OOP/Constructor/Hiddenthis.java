class Demo{

	Demo(){
	
		System.out.println("No argument");
	}

	Demo(int x){
	
		this();
		System.out.println("In para");
	}
	public static void main(String [] args){
	
		Demo obj=new Demo(10);
	}
}
