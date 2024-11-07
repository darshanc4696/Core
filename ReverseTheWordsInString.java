package corejava;

import java.util.Scanner;

public class ReverseTheWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		reverseString(input);

	}

	private static void reverseString(String input) {
		String[] ar = wordsInStr(input);
		
		for(String s : ar)
		{
			System.out.print(reverse(s)+" ");
		}
		
	}

	private static String reverse(String s) {
		
		String t = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			t += s.charAt(i);
		}
		
		return t;
	}

	private static String[] wordsInStr(String input) {
		int count = numOfWords(input);
		String[] ar = new String[count];
		String t = "";
		int j = 0;
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) != ' ')
			{
				t += input.charAt(i);
			}
			else if(t.length() > 0)
			{
				ar[j] = t;
				j++;
				t = "";
			}
		}
		
		if(t.length() > 0) ar[j] = t;
		return ar;
	}

	private static int numOfWords(String s) {
		
		int count = 0;
		
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		
		return s.charAt(0) != ' '? count+1 : count;
	}

}
