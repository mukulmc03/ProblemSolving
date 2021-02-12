package solved;

import java.util.Scanner;

/*
 * Bulb


You are given current status of light bulb(ON/OFF) and number N.

The switch of the bulb is flipped X times. where X is total number of divisors of N.

determine if bulb is ON or OFF

INPUT FORMAT:

Input consist of two space separated integers A and N

if bulb is ON A is 1 otherwise 0

OUTPUT FORMAT:

If Bulb is glowing print ON otherwise print OFF.

CONSTRAINT

1 <= N <= 10^18

0 <= A <= 1
*/

public class Bulb {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the value of A and N : ");
			int a = sc.nextInt();
			int n = sc.nextInt();
			
			//to find number of divisors of n
			int x = 0;
			for(int i = 1; i <= n; i++) {
				if(n % i == 0)
					x ++;
			}
			
			//to assign current status of bulb
			int oN = 1;
			boolean bool = (oN == a);
			
			//to change status of bulb in case of flipped(x) value is odd
			if(x % 2 != 0) {
				if(bool)
					bool = false;
				else
					bool = true;
			}
			
			if(bool)
				System.out.println("Bulb is ON!");
			else
				System.out.println("Bulb is OFF!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
