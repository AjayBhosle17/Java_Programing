class marvel {
static boolean mystartsWith(String str, String prefix, int index){
	if(index<0 || index>=str.length() || ((str.length()-index)-(prefix.length())<0))
		return false;
	char[] arr1 = str.toCharArray();
	char[] arr2 = prefix.toCharArray();

	for(int i=index;i<arr1.length;i++){
		int temp=i;
		int count = 0;
		for(int j=0;j<arr2.length;j++){
			if(arr1[i++]==arr2[j])
				count++;
		}
		i=temp;
		
		if(count==arr2.length)
			return true;
	}
	return false;
}
public static void main(String[] args){
String str = "Core2Web";
System.out.println(str.startsWith("b",7));
}
}
