package corejava;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch == 'a') sb.append("the");
			else sb.append(ch);
		}
		
		System.out.println(sb.toString());

	}

}
