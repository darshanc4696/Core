package corejava;

import java.util.Scanner;

public class Rearrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		rearrange(ar);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}		
	}

	private static void rearrange(int[] ar) {
		
		int i=ar.length-1, j=ar.length-1;
		
		while(i >= 0)
		{
			if(ar[i] == 0)
			{
				i--;
			}
			else
			{
				ar[j] = ar[i];
				i--;
				j--;
			}
		}
		
		while(j >= 0)
		{
			ar[j] = 0;
			j--;
		}
		
	}

}
