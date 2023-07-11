
class Demo{

	void add(int x,int y){
	
		System.out.println(x+y);
	}

	void add(int x,int y ,int z){
	
		System.out.println(x+y+z);
	}

	public static void main(String [] args){
	
		Demo obj=new Demo();

		obj.add(10,20);
		obj.add(10,20,30);
	}
	
}
