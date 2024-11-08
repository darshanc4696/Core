package corejava;

import java.util.Scanner;

public class MaximumProductOfSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<n; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.print(maxProd(ar));

	}

	private static int maxProd(int[] ar) {
		
		int maxp = Integer.MIN_VALUE;
		int prod = 1;
		
		
		for(int size = 1; size <= ar.length; size++)
		{
			for(int i=0; i<=ar.length-size; i++)
			{
				prod = 1;
				for(int j = i; j<i+size; j++)
				{
					prod *= ar[j];
				}
				
				if(prod > maxp) 
				{
					maxp = prod;
				}
			}
		}
		
		return maxp;
		
	}

}
