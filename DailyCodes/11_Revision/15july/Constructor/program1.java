class Demo{

	int x=10;
	Demo(){

	//	super();
	//	this();                      // recurcive chalt nhi // first line super // class name and constructor name same                                             // super has equivalent invokespecial // constructor does not have return type 
	//	                             // bydefault constructor parameter is this  // implicitly call to constructor
	//	                             // constructor use Instance variable initilize
		this(10);
		System.out.println(this);
		//this(10);
	
		System.out.println("Demo Constructor");
	}

	Demo(int x){
	
		System.out.println("Para");
	}

	static{
	
		System.out.println("In static");
	}
}

class client{

	client(){
	
		super();
		System.out.println("Clinet Constructor");
	}

	public static void main(String[] args){
	
		Demo obj=new Demo();                  // obj(this);
		System.out.println(obj);
		client obj1=new client();
	}
}
