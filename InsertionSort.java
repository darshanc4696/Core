package corejava;

import java.util.Scanner;

public class InsertionSort {

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
		for(int i=0; i<ar.length; i++)
		{
			int j=i;
			
			while(j >0 && ar[j] < ar[j-1])
			{
				int temp = ar[j];
				ar[j] = ar[j-1];
				ar[j-1] = temp;
				j--;
			}
		}

	}

}
