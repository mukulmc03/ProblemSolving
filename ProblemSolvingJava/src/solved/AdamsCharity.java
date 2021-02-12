package solved;

import java.util.Scanner;

/*
Adams Charity


Adam decides to be generous and do some charity. Starting today, from day 1 until day n, he gives i^2 coins to charity on day 'i' (1 <= i <= n).
Return the total coins he would give to charity

Input Specification : 

	i/p 1 : Number of days of charity

Output Specification : 

	o/p : Return the total number of coins till charity days.

Example 1 : 
	
	i/p 1 : 2

	o/p : 5

	Explanation : 
		There are 2 days.
		On the first day, he will give 1^2 = 1 coin.
		On the second day, he will give  2^2 = 4 coins.
		Total number of coins  = 1 + 4 = 5
*/

public class AdamsCharity {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter number of days of charity : ");
			int days = sc.nextInt();
			System.out.println("Total coins : " + adamsCharity(days));
		}
	}

	private static int adamsCharity(int days) {
		int coins = 0;
		for(int i = 1; i <= days; i ++) {
			coins += i * i;
		}
		return coins;
	}

}
