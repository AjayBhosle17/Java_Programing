/*
 *WAP to take size of array from user and also take integer elements from user
find the minimum element from the array

input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: min element = 0

*/

import java.io.*;

class SmallestEle {

	public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter size of array");
	int size = Integer.parseInt(br.readLine());
	
	int arr[] = new int[size];
	System.out.println("Enter elements in the array");

	for(int i=0; i<arr.length; i++) {

		arr[i] = Integer.parseInt(br.readLine());

	}

	int min = arr[0];

	for(int i=0; i<arr.length; i++) { //i can be initialized to 1

		if(arr[i] < min) {

			min = arr[i];

		}
	}

	System.out.println("Minimum element in the array = "+min);
	}
}

