package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(anagram(s, t));

	}
	
	private static boolean anagram(String s, String t)
	{
		if(s.length() != t.length()) return false;
//		
//		Map<Integer, Integer> map1 = new HashMap<>();
//		Map<Integer, Integer> map2 = new HashMap<>();
//		
//		for(int i=0; i<s.length(); i++)
//		{
//			int ch = s.charAt(i);
//			
//			if(map1.containsKey(ch))
//			{
//				map1.put(ch, map1.get(ch)+1);
//			}
//			else
//			{
//				map1.put(ch, 1);
//			}
//		}
//		
//		for(int i=0; i<t.length(); i++)
//		{
//			int ch = t.charAt(i);
//			
//			if(map2.containsKey(ch))
//			{
//				map2.put(ch, map2.get(ch)+1);
//			}
//			else
//			{
//				map2.put(ch, 1);
//			}
//		}
//		
//		for(int i : map1.keySet())
//		{
//			if(map1.get(i) != map2.get(i) || !map2.containsKey(i))
//			{
//				return false;
//			}
//		}
//		
//		return true;
		
		int[] ar = new int[26];
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			ar[ch - 'a'] = ar[ch - 'a'] + 1;
		}
		
		for(int i=0; i<t.length(); i++)
		{
			char ch = t.charAt(i);
			ar[ch - 'a'] = ar[ch - 'a'] - 1;
		}
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] != 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
