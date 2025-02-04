package corejava;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		quickSort(ar, 0, ar.length-1);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		sc.close();

	}
	
	private static int partition(int[] ar, int low, int high)
	{
		int pivot = ar[low];
		int i = low, j = high;
		
		while(i < j)
		{
			while(ar[i] <= pivot && i <= high-1)
			{
				i++;
			}
			
			while(ar[j] > pivot && j >= low+1)
			{
				j--;
			}
			
			if(i < j)
			{
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		
		int temp = ar[j];
		ar[j] = pivot;
		ar[low] = temp;
		
		return j;
		
	}
	
	private static void quickSort(int[] ar, int low, int high)
	{
		if(low > high)
		{
			return;
		}
		
		int partition = partition(ar, low, high);
		
		quickSort(ar, low, partition-1);
		quickSort(ar, partition+1, high);
	}

}
