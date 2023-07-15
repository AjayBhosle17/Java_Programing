class Demo{

	public static void main(String [] args){
	
		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity());

		StringBuffer sb1=new StringBuffer("Ajay");
		sb1.append("Bhosle");
		System.out.println(sb1.capacity());
		sb.append("ewwwwww");
		StringBuffer sb2=new StringBuffer(200);
		System.out.println(sb.capacity());

		System.out.println(sb2);
		System.out.println(sb2.capacity());
	}
}
