class Demo{

	void add(Object x){
	
		System.out.println(x);
	}

	void add(int x){
		
		System.out.println(++x);
	
	}

	void add(int x,int y){
	
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.add(10,20);
		obj.add(10);
	}
}
