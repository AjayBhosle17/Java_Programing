/*
 
1 a 3
b 5 c
7 d 9

*/

import java.io.*;


class Demo{
         
	public static void fun(int rows,int cols){

/*

			System.out.print("Enter Rows: ");

			int rows=Integer.parseInt(br.readLine());

			System.out.print("Enter cols: ");

			int cols=Integer.parseInt(br.readLine());
			
*/			int x=1;
			int y=1;
			char ch='a';
			for(int i=1;i<=rows;i++){
			
				for(int j=1;j<=cols;j++){
				
					if(x%2==0){
					
						System.out.print(ch +" ");
						ch++;
						x++;

					}else{
					
						System.out.print(y +" ");
						y++;
						x++;
					}		

				}
				System.out.println();
			}
	}
	
	public static void main(String[]args)throws IOException{
	
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter Rows: ");

			int rows=Integer.parseInt(br.readLine());

			System.out.print("Enter cols: ");

			int cols=Integer.parseInt(br.readLine());
	  	       
			fun(rows,cols);
	}

}
