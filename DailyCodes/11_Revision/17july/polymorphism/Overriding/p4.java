class Parent{


	char fun(){
	
		System.out.println("In char");
		return 'A';
	}
}

class child extends Parent{

	int fun(){
	
		return 10;
	}
}

class clint{

	public static void main(String [] args){
	Parent obj=new child();

	obj.fun();
	}
}
