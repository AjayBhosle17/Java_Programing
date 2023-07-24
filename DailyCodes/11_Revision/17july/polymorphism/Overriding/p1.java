
class Match{

	void matchType(){
	
		System.out.println("T20/oneday/Test");
	}
}

class IPLMATCH  extends Match{

	void matchType(){
	
		System.out.println("T20");
	}
}

class Testmatch extends Match {

	void matchType (){
	
		System.out.println("Test");
	}
}

class Client {

	public static void main (String [] args){
	
		Match type1=new IPLMATCH();
		Match type2=new Testmatch();

		type1.matchType();
		type2.matchType();
	}
}

