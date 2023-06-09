
class Demo{

	public static void mystrlen(String str){
	
		int cnt=0;

		try{
		
			while(true){
			
				str.charAt(cnt);
				cnt++;
			}
		
		}catch(IndexOutOfBoundsException ab){
		
		}

		System.out.println("cnt is " + cnt);
	}
	public static void main(String [] args){
	
		String str="Ajay";

		char [] chArray=str.toCharArray();

		int cnt=0;

		for(char c: chArray){
		
			cnt++;
		}

		System.out.println(cnt);

		mystrlen("Bhosle");
	}
}
