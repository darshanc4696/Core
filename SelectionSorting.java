package corejava;

import java.util.Scanner;

public class SelectionSorting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		sort(ar);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		sc.close();
	}
	
	public static void sort(int[] ar)
	{
		for(int i=0; i<ar.length-1; i++)
		{
			int mini = i;
			
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[j] < ar[mini]) mini = j;
			}
			
			int temp = ar[i];
			ar[i] = ar[mini];
			ar[mini] = temp;
		}

	}

}
