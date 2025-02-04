package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		List<List<Integer>> list = pairsWithSum(ar, k);
		
		for(List<Integer> l : list)
		{
			for(int i : l)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
	
	private static List<List<Integer>> pairsWithSum(int[] ar, int k)
	{
		Map<Integer, Integer> map = new HashMap<>();
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<ar.length; i++)
		{
			int rem = k - ar[i];
			
			if(map.containsKey(rem))
			{
				List<Integer> subList = new ArrayList<>();
				subList.add(rem);
				subList.add(ar[i]);
				list.add(subList);
			}
			
			map.put(ar[i], i);
		}
		
		return list;
		
		
	}

}
