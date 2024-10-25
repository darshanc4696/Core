package corejava;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = {120,153,370,371, 407};
		arm(ar);
	}

	private static void arm(int[] ar) {
		
		for(int i=0; i<ar.length; i++)
		{
			int sum = 0;
			int j = ar[i];
			int count = counter(j);
			
			while(j > 0)
			{
				int rem = j%10;
				sum += Math.pow(rem, count);
				j = j/10;
			}
			
			if(sum == ar[i]) System.out.println(ar[i]);
			
		}
		
	}

	private static int counter(int i) {
		
		int count = 0;
		while(i>0)
		{
			count++;
			i = i/10;
		}
		
		return count;
	}

}
