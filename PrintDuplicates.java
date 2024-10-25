package corejava;

import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scanner.nextInt();
		}
		
		printDup(ar);

	}

	private static void printDup(int[] ar) {
		
		int count = 1;
		boolean flag = false;
		
		for(int i=0; i<ar.length-1; i++)
		{
			if(ar[i] == ar[i+1])
			{
				count++;
			}
			else
			{
				if(count > 1)
				{
					flag = true;
					System.out.print(ar[i]+" ");
				}
				count = 1;
			}
		}
		
		if(count > 1)
		{
			System.out.print(ar[ar.length-1]);
			flag = true;
		}
		
		if(!flag)
		{
			System.out.println("-1");
		}
		
	}

}
