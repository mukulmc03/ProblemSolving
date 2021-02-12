package solved;

import java.util.Scanner;

/*
Push Zeroes to End


Write a function to push all the zeroes that are present to the end of the array.
The respective order of other elements should remain the same.

Input Specification : 

	i/p 1 : Array Elements
	i/p 2 : Integer N, Array Size

Output Specification : 
	
	o/p : Return the array containing non zero elements first followed by the zeroes.

Example 1 : 

	i/p 1 : {5, 0, 7, 6}
	i/p 2 : 4

	o/p : {5, 7, 6, 0}

	Explanation : On shifting zeroes to end, the array will change from {5, 0, 7, 6} to {5, 7, 6, 0}. 
*/

public class PushZeroesToEnd {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter size of the array : ");
			int size = sc.nextInt();
			int array[] = new int[size];
			System.out.println("Enter elements of an Array : ");
			for(int i = 0; i < size; i ++)
				array[i] = sc.nextInt();
			
			pushZeroesToEnd(array, size);
			System.out.println("Array after pushing zeroes to end : ");
			for(int i = 0; i < size; i ++)
				System.out.print(array[i] + " ");
		}

	}

	private static void pushZeroesToEnd(int[] array, int size) {
		int count = 0;
		
		for(int i = 0; i < size; i ++) {
			if(array[i] != 0) {
				array[count ++] = array[i]; 
			}
		}
		while(count < size)
			array[count ++] = 0;
	}

}
