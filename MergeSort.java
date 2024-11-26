package corejava;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] ar = new int[size];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		mergeSort(ar, size);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

	private static void mergeSort(int[] ar, int size) {
		
		if(size < 2)
		{
			return;
		}
		
		int mid = size/2;
		
		int[] left = new int[mid];
		int[] right = new int[size - mid];
		
		for(int i=0; i<mid; i++)
		{
			left[i] = ar[i];
		}
		
		for(int i=mid; i<size; i++)
		{
			right[i-mid] = ar[i];
		}
		
		mergeSort(left, left.length);
		mergeSort(right, right.length);
		
		sort(ar, left, right);
		
	}

	private static void sort(int[] ar, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		
		while(i < left.length && j < right.length)
		{
			if(left[i] <= right[j])
			{
				ar[k++] = left[i++];
			}
			else
			{
				ar[k++] = right[j++];
			}
		}
		
		while(i < left.length)
		{
			ar[k++] = left[i++];
		}
		
		while(j < right.length)
		{
			ar[k++] = right[j++];
		}
	
	}

}
