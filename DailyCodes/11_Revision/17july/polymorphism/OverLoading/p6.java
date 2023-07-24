class IPL {

	
	void matchInfo(String team1,String team2){
	
		System.out.println(team1 + "vs" + team2);
	}

	void matchInfo(String team1){
	
		System.out.println(team1);
	}
	
}

class client{

	public static void main(String [] args){
	
		IPL x=new IPL();

		x.matchInfo("RCB", "MI");
		x.matchInfo("CSK", "RR");
	}
}
