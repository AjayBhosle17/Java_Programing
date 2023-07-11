class CyberCrime {
    
	CyberCrime(){
	
		System.out.println("Criminal Activities");
	}
    	void investigate() {
        	
		 System.out.println("Investigating cyber crime.");
        
    	}
}

class Hacking extends CyberCrime {
 

	Hacking(){
	
		System.out.println("Unauthorized access");

	}
    	void fraud() {
        
		System.out.println("Sim -card Fraud");
	}
}

class Phishing extends CyberCrime {
    

	Phishing(){
	
		System.out.println("Sending deceptive emails or messages");
	}
      	void Credentials() {

        	System.out.println("credentials on  phishing email");
	}
}

class client {

    public static void main(String[] args) {
  
	 Hacking hackingCrime = new Hacking();
         hackingCrime.investigate();
         hackingCrime.fraud();

         Phishing Crime = new Phishing();
         Crime.Credentials();
         Crime.investigate();
    }
}

