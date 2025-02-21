package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestSubarrayOfSumk {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		int[] ar = new int[] {3,4,7,2,-3,1,4,2};
		int[] ar = new int[] {1,2,3,4,5,6};
		int k = sc.nextInt();
		
		subArray(ar, k);

	}

	private static void subArray(int[] ar, int k) {
		
		int maxi = 0;
		int p1 = 0, p2 = 0;
		int sum = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for(int i=0; i<ar.length; i++)
		{
			sum += ar[i];
			
			if(sum == k)
			{
//				if(maxi < i+1)
//				{
					maxi = i+1;
					p1 = 0;
					p2 = i+1;
//				}
			}
			
			int rem = sum - k;
			if(map.containsKey(rem))
			{
				if(maxi < i-map.get(rem))
				{
					maxi = i-map.get(rem)+1;
					p1 = map.get(rem)+1;
					p2 = i+1;
				}
			}
			
			if(!map.containsKey(sum))
			{
				map.put(sum, i);
			}
		}
		System.out.println(p1);
		System.out.println(p2);
		
		
		for(int i=p1; i<p2; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
