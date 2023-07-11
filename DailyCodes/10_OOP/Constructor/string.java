class Demo{

	private int jerNo=0;
	private String name=null;

	Demo(int jerNo,String name){
	
		this.jerNo=jerNo;
		this.name=name;
	}

	void info(){
	
		System.out.println(jerNo + " = " + name);
		System.out.println(this.name);
		System.out.println(System.identityHashCode(this.name));
	}

	
}

class client{

	public static void main(String[]args){
	
		Demo obj1=new Demo(18,"Virat");
		obj1.info();
	
		String name=new String("Virat");;	
		Demo obj2=new Demo(18,name);
		obj2.info();
		Demo obj3=new Demo(18,"Virat");
		obj1.info();
	}
}
