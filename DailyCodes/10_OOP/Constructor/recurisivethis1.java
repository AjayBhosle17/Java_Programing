class Demo{

	Demo(){

		this(10);	
		System.out.println("In contructor");
	}

	Demo(int x){
		this();	
		System.out.println(x);
	}

	public static void main(String [] args){
	
		Demo obj=new Demo(10);

	}
}
