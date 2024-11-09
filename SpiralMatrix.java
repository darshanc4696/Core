package corejava;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] ar = new int[m][n];
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				ar[i][j] = sc.nextInt();
			}
		}
		
		printing(ar);

	}

	private static void printing(int[][] ar) {
		
		int top = 0, bottom = ar.length-1;
		int left = 0, right = ar[0].length-1;
		
		
		while(top <= bottom && left <= right)
		{
			for(int i=left; i<=right; i++)
			{
				System.out.print(ar[top][i]+" ");
			}
			top++;
			
			for(int i=top; i<=bottom; i++)
			{
				System.out.print(ar[i][right]+" ");
			}
			right--;
			
			
			for(int i=right; i>=left; i--)
			{
				System.out.print(ar[bottom][i]+" ");
			}
			bottom--;
			
			for(int i=bottom; i>=top; i--)
			{
				System.out.print(ar[i][left]+" ");
			}
			left++;
		}
		
	}

}
