package corejava;

import java.util.Scanner;

public class SeconLargest 
{
	
	static int secondLargest(int[] ar)
	{
		int firstL = Integer.MIN_VALUE, secondL = Integer.MIN_VALUE;
//		
//		if(ar[0] > ar[1])
//		{
//			firstL = ar[0];
//			secondL = ar[1];
//		}
//		else
//		{
//			firstL = ar[1];
//			secondL = ar[0];
//		}
//		
		for(int i=0 ; i<ar.length; i++)
		{
			if(ar[i] > firstL)
			{
				secondL = firstL;
				firstL = ar[i];
			}
			else if(ar[i] > secondL && ar[i] != firstL)
			{
				secondL = ar[i];
			}
			
		}
		
		return secondL;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int[] ar = new int[size];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scanner.nextInt();
		}
		
		System.out.println(secondLargest(ar));

	}

}
