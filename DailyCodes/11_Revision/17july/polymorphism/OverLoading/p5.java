class parent{

	parent(){
	
		System.out.println("parent");
	}
}

class child extends parent{

	child(){
	
		System.out.println("child");
	}

	public static void main(String [] args){
	
		child obj=new child();
	}
}
