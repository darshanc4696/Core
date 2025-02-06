package corejava;

import java.util.Scanner;

public class MatrixParsing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j < matrix[i].length; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(isDiagonalElementsSame(matrix));

	}
	
	private static boolean isDiagonalElementsSame(int[][] matrix)
	{
		int num = matrix[0][0];
		int num1 = matrix[0][matrix.length-1];
		
		for(int i=1; i<matrix.length; i++)
		{
			if(matrix[i][i] != num || matrix[i][matrix.length-i-1] != num1)
			{
				return false;
			}
		}
		
		return true;
	}

}
