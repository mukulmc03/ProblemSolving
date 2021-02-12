package solved;

import java.util.Scanner;

/*
Maximum Sum


Write a program that adds up the largest row sum and the largest column sum from an N-rows * M-columns array of numbers.
As a preliminary phase, you should reformat the sequence of numbers as a matrix, whose number of rows and columns are to be specified as arguments.

Input Specification : 
	
	i/p 1 : Integer for row dimension of the array
	i/p 2 : Integer for column dimension of the array
	i/p 3 : Array elements to be entered in row major

Output Specification : 
	
	o/p : Largest row sum + Largest column sum

Example 1 : 
	
	i/p 1 : 2
	i/p 2 : 2
	i/p 3 : {1, 2, 5, 6}

	o/p : 19

	Explanation : 
		The array has 2 rows(i/p 1) and 2 columns(i/p 2). The elemenst in the 1st row are 1 & 2 and the elements in the second row are 5 & 6(i/p 3).
		The largest sum among the two rows is 11(5 + 6). The largest sum among the two columns is 8(2 + 6). By adding those two up, we get the final sum of 19(11 + 8). 

*/

public class MaximumSum {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter number of Rows : ");
			int rows = sc.nextInt();
			System.out.println("Enter number of Columns : ");
			int columns = sc.nextInt();
			
			System.out.println("Enter elements of matrix : ");
			int[][] matrix = new int[rows][columns];
			for(int i = 0; i < rows; i ++) {
				for(int j = 0; j < columns; j ++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			
			maximumSum(matrix);
			
			/*
			 	to print number of rows : matrix.length & columns : matrix[0].length
				System.out.println(matrix.length);
				System.out.println(matrix[0].length);
			*/
		}

	}

	private static void maximumSum(int[][] matrix) {
		int largestRowSum = 0, largestColumnSum = 0;
		
		//to find row sum
		for(int i = 0; i < matrix.length ; i ++) {
			int rowSum = 0;
			for(int j = 0; j < matrix[0].length ; j ++) {
				rowSum += matrix[i][j];
				if(largestRowSum < rowSum)
					largestRowSum = rowSum;
			}
			//System.out.println("Row " + i + " : " + rowSum);
		}
		//System.out.println("Largest Row Sum : " + largestRowSum);
		
		//to find column sum
		for(int j = 0; j < matrix[0].length; j ++) {
			int columnSum = 0;
			for(int i = 0; i < matrix.length; i++) {
				columnSum += matrix[i][j];
				if(largestColumnSum < columnSum)
					largestColumnSum = columnSum;
			}
			//System.out.println("Column " + j + " : " + columnSum);
		}
		//System.out.println("Largest Column Sum : " + largestColumnSum);
		System.out.println("Maximum Sum : " + (largestRowSum + largestColumnSum));
	}
}
