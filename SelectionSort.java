package corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
//		sSort(ar);
//		bSort(ar);
//		iSort(ar);
//		mSort(ar, 0, ar.length-1);
		qSort(ar, 0, ar.length-1);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}


	}

	private static void qSort(int[] ar, int low, int high) {
		
		if(low < high)
		{
			int partiton_index = partition(ar, low, high);
			qSort(ar, low, partiton_index-1);
			qSort(ar, partiton_index+1, high);
		}
		
		
	}
	
	

	private static int partition(int[] ar, int low, int high) {
		
		
		int i = low, j = high, pivot = ar[low];
		
		while(i < j)
		{
			while(ar[i] <= pivot && i<high)
			{
				i++;
			}
			
			while(ar[j] >= pivot && j>low)
			{
				j--;
			}
			
			if(i < j)
			{
				int temp = ar[j];
				ar[j] = ar[i];
				ar[i] = temp;
			}
		}
		
		int temp = ar[low];
		ar[low] = ar[j];
		ar[j] = temp;
		
		return j;
	}

	private static void mSort(int[] ar, int low, int high) {
		
		if(low >= high) return;
		int mid = low + (high - low)/2;
		
		mSort(ar, low, mid);
		mSort(ar, mid+1, high);
		merge(ar, low, mid, high);
		
		
		
	}

	private static void merge(int[] ar, int low, int mid, int high) {
		
		int i = low, j = mid+1;
		List<Integer> list = new ArrayList<>();
		
		while(i<=mid && j<=high)
		{
			if(ar[i] <= ar[j])
			{
				list.add(ar[i]);
				i++;
			}
			else
			{
				list.add(ar[j]);
				j++;
			}
			
		}
		
		
		while(i<=mid)
		{
			list.add(ar[i]);
			i++;
		}
		
		while(j<=high)
		{
			list.add(ar[j]);
			j++;
		}
		
		for(i=low; i<=high; i++)
		{
			ar[i] = list.get(i - low);
		}
		
	}

	private static void iSort(int[] ar) {
		
		for(int i=0; i<ar.length; i++)
		{
			int j = i;
			
			while(j > 0 && ar[j] < ar[j-1])
			{
				int temp = ar[j];
				ar[j] = ar[j-1];
				ar[j-1] = temp;
				
				j--;
			}
		}
		
	}

	private static void bSort(int[] ar) {
		for(int i=0; i<ar.length; i++)
		{
			boolean flag = false;
			
			for(int j=0; j<ar.length-1; j++)
			{
				if(ar[j+1] < ar[j])
				{
					flag = true;
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			
			if(! flag)
			{
				break;
			}
			
		}
		
	}

	private static void sSort(int[] ar) {
		
		for(int i=0; i<ar.length; i++)
		{
			int min = i;
			
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[j] < ar[min]) min = j;
			}
			
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
		}
	}
	
	

}
