import java.io.*;

class Demo{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Demo obj=new Demo();

		char ch;
		do{


		System.out.println("All String Methods");

		System.out.println("1.Mystrlen");
		System.out.println("2.MyCompareto");
		System.out.println("3.MyConcat");
		System.out.println("4.MyCompareToIgnoreCase");
		System.out.println("5.MyEqual");
		System.out.println("6.MyEqualIgnoreCase");
		System.out.println("7.");
		System.out.println("8.Kahich Nko mla yatl");

		System.out.print("\nWhich method u want: ");
		int choice=Integer.parseInt(br.readLine());

		switch(choice){
		
			case 1:{
				System.out.print("Enter String 1 : ");
				String str=br.readLine();
				
				int length=obj.mystrlen1(str);

				System.out.println("\n"+ str + " String length is = "+ length);
			       }
				break;
			case 2:{
				System.out.print("Enter String 1 : ");
				String str1=br.readLine();
				
				System.out.print("Enter String 2 : ");
				String str2=br.readLine();
				
				int length=obj.mystrcomp(str1,str2);

				if(length==0){
				
					System.out.println("Strings are same");
				}else{

					System.out.println("\nString compare is = "+ length);
			       }
		               }
			
				break;
			case 3:
				{
				
				System.out.print("Enter String 1 : ");
				String str1=br.readLine();
				
				System.out.print("Enter String 2 : ");
				String str2=br.readLine();
				
				String str=obj.myconcat(str1,str2);

				System.out.println("\nconcat string is = "+str);

				
				}
				break;
			case 4:
				{
				
				System.out.print("Enter String 1 : ");
				String str1=br.readLine();
				
				System.out.print("Enter String 2 : ");
				String str2=br.readLine();
				
				//int str3=str1.compareToIgnoreCase(str2);
				int len1=obj.mycompareToIgnorecase(str1,str2);

				if(len1==0){
				
					System.out.println("\nStrings Are same");
				}else{

					System.out.println("\nDifference of string is = "+ len1);
				}
				}
				break;

			case 5:
				{
				
				System.out.print("Enter String 1 : ");
				String str1=br.readLine();
				
				System.out.print("Enter String 2 : ");
				String str2=br.readLine();
				
				//boolean x=str1.equals(str2);
			
				boolean x=obj.myequal(str1,str2);

				if(x==true){
				
					System.out.println("\nBoth Strings are equal");
				}else{
				
					System.out.println("\nBoth Strings are not equal");

				}
				}
				break;

			case 6:
				{
				
				System.out.print("Enter String 1 : ");
				String str1=br.readLine();
				
				System.out.print("Enter String 2 : ");
				String str2=br.readLine();
				
				boolean x=obj.myequalIgnoreCase(str1,str2);

				if(x==true){

					System.out.println("\nBoth Strings are equal");
				}else{

					System.out.println("\nBoth Strings are not equal");
				}
				}
				break;
			
			case 7:
				{
				System.out.print("Enter String 1 : ");
				String str1=br.readLine();
				
				System.out.println("Enter string to add on starting position");
				String str2=br.readLine();
				System.out.println(str1.startsWith(str2,5));
				
				}	
			
			case 8:{
				System.out.println("\nCode kr re bhava");
				System.exit(0);
			       }
			       break;
			
			default:
				System.out.println("\nChoose Correct option");
		}
		
		System.out.print("\nAjun kahi hvy ka plz enter (y/n): ");
		ch=(char)br.read();
		br.skip(1);
		
	}while(ch=='Y' || ch=='y');
	
	System.out.println("\nTnx\n");
	}
	
/******************************************************************************************************************************/

	int mystrlen1(String str){

		char arr[]=str.toCharArray();

		int cnt=0;
		for(int i:arr){
					
			cnt++;
		}
		return cnt;
	}	

/******************************************************************************************************************************/

	int mystrcomp(String str1,String str2){
	
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		int diff=0;
		int len1=mystrlen1(str1);
		int len2=mystrlen1(str2);

		if(len1==len2){

			for(int i=0;i<arr1.length;i++){
		
				if(arr1[i]!=arr2[i]){
				
					diff=arr1[i]-arr2[i];
					break;
				}
			}
		}else{
		
			diff=len1-len2;
		}
		return diff;
	}

/******************************************************************************************************************************/

	String myconcat(String str1, String str2){
		
		String str3=str1+str2;

		return str3;

	}

/******************************************************************************************************************************/

	int mycompareToIgnorecase(String str1,String str2){
	
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		int len1=mystrlen1(str1);
		int len2=mystrlen1(str2);

		int diff=0;
		if(len1==len2){
		
			for(int i=0;i<arr1.length;i++){
			
				if(arr1[i]!=arr2[i] && arr1[i]!=arr2[i]+32 && arr2[i]!=arr1[i]+32){
					
					diff=arr1[i]-arr2[i];
					break;	

				}
			}
		}else{
		
			diff=len1-len2;

		}
		return diff;
	}
/******************************************************************************************************************************/

	boolean myequal(String str1,String str2){
	
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		int len1=mystrlen1(str1);
		int len2=mystrlen1(str2);

		if(len1==len2){
		
			for(int i=0;i<arr1.length;i++){
			
				if(arr1[i]!=arr2[i]){
				
					return false;
				}
			}
			return true;

		}else{
		
			return false;
		}
	}
/******************************************************************************************************************************/
	
	boolean myequalIgnoreCase(String str1,String str2){
	
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();

		int len1=mystrlen1(str1);
		int len2=mystrlen1(str2);

		if(len1==len2){
		
			for(int i=0;i<arr1.length;i++){
			
				if(arr1[i]!=arr2[i] && arr1[i]!=arr2[i]+32 && arr2[i]!=arr1[i]+32){
				
					return false;
				}
			}
			return true;

		}else{
		
			return false;
		}
	}
/******************************************************************************************************************************/



}
