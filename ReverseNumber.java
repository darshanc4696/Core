package corejava;

import java.util.Scanner;

public class ReverseNumber {
	static int rev;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		reverseNum3(n);
//		System.out.println(rev);

	}

	private static void reverseNum1(int n) {
		
		int rev = 0;
		
		while(n > 0)
		{
			int rem = n%10;
			rev = (rev * 10) + rem;
			n = n/10;
		}
		
		System.out.println(rev);
		
	}
	
	private static void reverseNum2(int n) {
		
		if(n <= 0)
		{
			return;
		}
		
		int rem = n%10;
		rev = (rev*10) +rem;
		reverseNum2(n/10);
	}
	
	private static void reverseNum3(int n) {
		
		
		String temp = "" + n;
		StringBuilder sb = new StringBuilder(temp);
		sb.reverse();
		System.out.println(sb.toString());
		
		
	}

}
