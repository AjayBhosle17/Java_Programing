import java.io.*;

class Demo{

	public static void main(String[]args) throws IOException{
        char ch;
	do{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
	        System.out.println("Welcome in ***Cafehaven***");
	        System.out.println("1.Burger");
	        System.out.println("2.pizza");
	        System.out.println("plz enter ur choice");
	        	
                int x=Integer.parseInt(br.readLine());

		switch(x){
		
			case 1:{
				System.out.println("Many of the varities are available: ");
				System.out.println("1.veg Burger");
				System.out.println("2.Nonveg Burger");
				System.out.println("plz enter your choice");

                
				int choice=Integer.parseInt(br.readLine());

				switch(choice){
				
					case 1:
						System.out.println("Nice Quality");
						break;
					case 2:
						System.out.println("Better than veg");
						break;
					default:
						System.out.println("plz chooze burger");

                
				}
				break;
			}
		        case 2:{
				
			       System.out.println("Many of the varities are available: ");
				System.out.println("1.onion pizza");
				System.out.println("2.paneer pizza");
				System.out.println("plz enter your choice");

                
				int choice=Integer.parseInt(br.readLine());

				switch(choice){
				
					case 1:
						System.out.println("good Quality");
						break;
					case 2:
						System.out.println("best pizza");
						break;
					default:
						System.out.println("plz chooze pizza");

                
				}
				break;
			}
		                                       
			  	
			default:
				System.out.println("this type of food not available");

		}
	           System.out.println("Ajun kahi hvy ka ? plz enter(y/n)");

		    ch=(char)br.read();

	}while(ch=='y' || ch=='Y');

	System.out.println("Cafe madhe bhet dilyabaddle dhanyawad...cafe apl aabhari aahe..");
	}

}
