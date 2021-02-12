package solved;

import java.util.Scanner;

/*
 * Sales By Match


There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example

There is one pair of color and one of color . There are three odd socks left, one of each color. The number of pairs is

.

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

    int n: the number of socks in the pile
    int ar[n]: the colors of each sock

Returns

    int: the number of pairs

Input Format

The first line contains an integer
, the number of socks represented in .
The second line contains space-separated integers,

, the colors of the socks in the pile.

Constraints

where

Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output

3

Explanation

sock.png

There are three pairs of socks.
*/

public class SalesByMatch {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter number of socks in the pile : ");
			int socks = sc.nextInt();
			int arr[] = new int[socks];
			
			System.out.println("Enter the colours of each sock : ");
			for(int i = 0; i < socks; i ++) {
				arr[i] = sc.nextInt();
			}
			
			//businessLogic
			int count = 0;
			for(int i = 0; i < arr.length; i ++) {
				if(arr[i] != 0) {
					for(int j = i + 1; j < arr.length; j ++) {
						if(arr[i] == arr[j]) {
							count ++;
							arr[j] = 0;
							break;
						}
					}
				}
			}
			System.out.println("Total pairs of socks : " + count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
