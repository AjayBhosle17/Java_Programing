class Demo{


	void fun(String str){
	
		System.out.println(str);
	}

	void fun(StringBuffer str){
	
		System.out.println(str);
	}

}

class client{

	public static void main(String [] args){
	

		Demo obj=new Demo();

		obj.fun(new String("Ajay"));

		obj.fun(new StringBuffer("Mayur"));

		obj.fun(null);
	}
}
