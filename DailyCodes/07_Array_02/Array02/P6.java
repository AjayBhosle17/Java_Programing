/*
 * WAP to take size of array from user and also take integer elements from user
find the maximum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: max element = 5

*/

import java.io.*;

class LargestEle {

	public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter size of array");
	int size = Integer.parseInt(br.readLine());
	
	int arr[] = new int[size];
	System.out.println("Enter elements in the array");

	for(int i=0; i<arr.length; i++) {

		arr[i] = Integer.parseInt(br.readLine());

	}

	int max = arr[0];

	for(int i=0; i<arr.length; i++) { //i can be initialized to 1

		if(arr[i] > max) {

			max = arr[i];

		}
	}

	System.out.println("Maximum element in the array = "+ max);
	}
}

