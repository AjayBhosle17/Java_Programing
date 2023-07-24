class Demo{

	int sum(int a,int b){
	
		System.out.println(Integer.sum(a,b));
		return a+b;
	}
	

	void sum(int a){
	
		System.out.println(a);
	}

	void sum(float x){
	
		System.out.println(x);
	}

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.sum(10,20);
		//obj.sum(10,20,20);
		obj.sum(10);
	}
}
