class Demo{

	static void swap(int x,int y){
	
		int temp=x;
		x=y;
		y=temp;

		System.out.println(x + " "+ y);
	}
	public static void main(String [] args){
	
		int x=10;
		int y=20;

		swap(x,y);
	}
}
