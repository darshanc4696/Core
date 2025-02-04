package corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSortAgain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		mergeSort(ar, 0, ar.length-1);
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		sc.close();

	}
	
	public static void mergeSort(int[] ar, int low, int high)
	{
		if(low >= high) return;
		
		int mid = (low + high)/2;
		
		mergeSort(ar, low, mid);
		mergeSort(ar, mid+1, high);
		merge(ar, low, mid, high);
	}
	
	public static void merge(int[] ar, int low, int mid, int high)
	{
		 int i = low, j=mid+1;
		 List<Integer> list = new ArrayList<>();
		 
		 while(i <= mid && j <= high)
		 {
			 if(ar[i] <= ar[j])
			 {
				 list.add(ar[i++]);
			 }
			 else
			 {
				 list.add(ar[j++]);
			 }
		 }
		 
		 while(i<=mid)
		 {
			 list.add(ar[i++]);
		 }
		 
		 while(j <= high)
		 {
			 list.add(ar[j++]);
		 }
		 
		 for(i=low; i<= high; i++)
		 {
			 ar[i] = list.get(i-low);
		 }
	}

}
