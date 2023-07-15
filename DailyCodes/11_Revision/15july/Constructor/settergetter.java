class Demo{

	private String name=null;
	private int jersey=0;

	Demo(String name, int jersey){
	
		this.name=name;
		this.jersey=jersey;
	}

 	void cricket(){
	
		System.out.println(name + " "+ jersey);

	}
	public static void main(String [] args){
	
		Demo obj=new Demo("Virat",18);
		obj.cricket();
		Demo obj1=new Demo("Rohit",45);
		obj1.cricket();
	}
}
