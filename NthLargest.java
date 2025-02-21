package corejava;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NthLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		System.out.println(findLargest(ar, k));

	}

	private static char[] findLargest(int[] ar, int k) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i=0; i<ar.length; i++)
		{
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}

}
