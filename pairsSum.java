package corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class pairsSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] ar = new int[] {4,2,3,5,7};
		int k = sc.nextInt();
		
		pairs(ar, k);

	}

	private static void pairs(int[] ar, int k) {
		
		List<List<Integer>> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<ar.length; i++)
		{
			if(set.contains(k - ar[i]))
			{
				List<Integer> subl = new ArrayList<>();
				subl.add(k-ar[i]);
				subl.add(ar[i]);
				list.add(subl);
			}
			
			set.add(ar[i]);
		}
		
		
		for(List<Integer> l : list)
		{
			for(int i : l)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
