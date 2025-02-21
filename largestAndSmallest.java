package corejava;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class largestAndSmallest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] ar = new int[] {3,4,7,2,-3,1,4,2};
//		int[] ar = new int[] {1,2,3,4,5,6};
		int k = sc.nextInt();
		
		largest(ar, k);
		smallest(ar, k);

	}

	private static void smallest(int[] ar, int k) {
		PriorityQueue<Integer> pr = new PriorityQueue<>(k,Comparator.reverseOrder());
		
		
		for(int i=0; i<ar.length; i++)
		{
			if(pr.size() < k)
			{
				pr.add(ar[i]);
			}
			else
			{
				if(pr.peek() > ar[i])
				{
					pr.poll();
					pr.add(ar[i]);
				}
			}
		}
		
		System.out.println(pr.peek());
		
	}

	private static void largest(int[] ar, int k) {
		PriorityQueue<Integer> pr = new PriorityQueue<>(k);
		
		
		for(int i=0; i<ar.length; i++)
		{
			if(pr.size() < k)
			{
				pr.add(ar[i]);
			}
			else
			{
				if(pr.peek() < ar[i])
				{
					pr.poll();
					pr.add(ar[i]);
				}
			}
		}
		
		System.out.println(pr.peek());
		
		
	}

}
