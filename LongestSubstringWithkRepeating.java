package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithkRepeating {
	
	private static int longSubstringLen(String s, int k) {
		
		
		String t = "";
		
		for(int size = s.length(); size >= k; size--)
		{
			for(int i = 0; i<= s.length()-size; i++)
			{
				for(int j = i; j<i+size; j++)
				{
					t += s.charAt(j);
				}
				
				if(check(t, k))
				{
					System.out.println(t);
					return t.length();
				}
				
				t="";
			}
		}
		
		System.out.println(t);
		return t.length();
	}

	private static boolean check(String t, int k) {
		
		
		Map<Character, Integer> map = new HashMap<>();
//		map.clear();
		
		for(int i=0; i<t.length(); i++)
		{
			char ch = t.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
//		System.out.println("in map for substring "+ t);
		for(int e : map.values())
		{
			if(e < k) return false;
//			System.out.print(e+" ");
		}
//		System.out.println();
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		System.out.println(longSubstringLen(s, k));
	}

}
