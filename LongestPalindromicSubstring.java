package corejava;

import java.util.Scanner;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(lps(s));

	}
	
	private static String lps(String s)
	{
		for(int size=s.length(); size>=0; size--)
		{
			for(int i=0; i<=s.length()-size; i++)
			{
				if(isPalindrome(s, i, i+size))
				{
					return s.substring(i, i+size);
				}
			}
		}
		
		return "";
	}

	private static boolean isPalindrome(String s, int i, int j) {
		j = j-1;
		while(i < j)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
			}
			else 
			{
				return false;
			}
		}
		
		
		return true;
	}

}
