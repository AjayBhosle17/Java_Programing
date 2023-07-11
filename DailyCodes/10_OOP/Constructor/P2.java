class Demo{

	 int x=40;

	Demo(){
	
		int x=20;
		System.out.println("In Constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	Demo(int x){
	
		System.out.println("In Second Constructor");
		System.out.println(x);
		System.out.println(this.x);
	

	}

	static void m2(){
	
		//System.out.println(x);
		System.out.println(this);
	}
	public static void main(String []args){
	
		Demo obj=new Demo();   
		Demo obj1=new Demo(10);
		System.out.println(obj);
		System.out.println(obj1);
		obj1.m2();
	}
}
