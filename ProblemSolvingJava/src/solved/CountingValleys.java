package solved;

import java.util.Scanner;

/*
 * Counting Valleys


An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps, for every step it was noted if it was an uphill, , or a downhill, step. Hikes always start and end at sea level, and each step up or down represents a

unit change in altitude. We define the following terms:

    A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
    A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.

Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

Example

The hiker first enters a valley units deep. Then they climb out and up onto a mountain

units high. Finally, the hiker returns to sea level and ends the hike.

Function Description

Complete the countingValleys function in the editor below.

countingValleys has the following parameter(s):

    int steps: the number of steps on the hike
    string path: a string describing the path

Returns

    int: the number of valleys traversed

Input Format

The first line contains an integer
, the number of steps in the hike.
The second line contains a single string , of

characters that describe the path.

Constraints

Sample Input

8
U D D D U D U U

Sample Output

1

Explanation

If we represent _ as sea level, a step up as /, and a step down as \, the hike can be drawn as:

_/\      _
   \    /
    \/\/

The hiker enters and leaves one valley.
 * */

public class CountingValleys {

	/* One logical flaw in the following program. It is accepting int steps = sc.nextInt(); but not using it anywhere, that's why 
	 * if f I provide 4 steps but path -> DDDDUU(6 steps) it is still going to accept the input and return 0! 
	 * I think that's where the code fails.  
	 */
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int topLevel = 0, valleyCount = 0; 
			System.out.println("Enter the number of steps in hike : ");
			int steps = sc.nextInt();
			String path = sc.next();
			
			for(char c : path.toCharArray()) {
				if(c == 'U')
					++ topLevel;
				
				if(c == 'D')
					-- topLevel;
				
				if(topLevel == 0 && c == 'U')
					++ valleyCount;
			}
			
			System.out.println("Hiker enters and leaves " + valleyCount + " valleys!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
